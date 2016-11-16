(ns calculator.events
  (:require [re-frame.core :refer [reg-event-db]]
            [calculator.db :refer [initial-state]]))

(def ->float js/parseFloat)

(reg-event-db ;; register event handler
 :initialise-db ;; event name
 (fn [db _]
   (merge db initial-state))) ;; handler mutates app state

(reg-event-db
 :set-value
 (fn [db [_ value]]
   (let [v (:value db)
         nv (:next-value db)
         op (:operation db)]
     (cond
       (and v (not= "0" v) op) (assoc db :next-value (str value))
       (and v (= "0" v)) (assoc db :value (str value))
       :else (assoc db :value (str v value))))))

(reg-event-db
 :clear
 (fn [db _]
   (-> db
     (assoc :value "0")
     (assoc :next-value nil)
     (assoc :operation nil))))

(reg-event-db
 :set-dot
 (fn [db _]
   (update db :value #(cond
                       (re-matches #"[0-9]+\." %) %
                       (int? (->float %)) (str % ".")
                       :else %))))

(reg-event-db
 :invert
 (fn [db _]
   (update db :value #(str (- (->float %))))))

(reg-event-db
 :to-percent
 (fn [db _]
   (update db :value #(str (/ (->float %) 100)))))

(reg-event-db
 :set-divide
 (fn [db _]
   (assoc db :operation #(/ (->float %1) (->float %2)))))

(reg-event-db
 :set-multiply
 (fn [db _]
   (assoc db :operation #(* (->float %1) (->float %2)))))

(reg-event-db
 :set-subtract
 (fn [db _]
   (assoc db :operation #(- (->float %1) (->float %2)))))

(reg-event-db
 :set-sum
 (fn [db _]
   (assoc db :operation #(+ (->float %1) (->float %2)))))

(reg-event-db
 :calculate
 (fn [{:keys [value next-value operation] :as db} _]
   (when (and next-value operation)
     (-> db
       (assoc :value (str (operation value next-value)))
       (assoc :next-value nil)
       (assoc :operation nil)))))
