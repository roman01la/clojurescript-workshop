(ns calculator.components.pad
  (:require [reagent.core :as r]
            [calculator.components.base :refer [button]]))

(def ->float js/parseFloat)

(def pad-nums
  ["AC" "±" "%" "÷"
   7    8   9   "×"
   4    5   6   "–"
   1    2   3   "+"
   0    nil "." "="])

(defn handle-click [state n]
  (cond
    (number? n) (swap! state (fn [s]
                              (let [v (:value s)
                                    nv (:next-value s)
                                    op (:operation s)]
                                (cond
                                  (and v (not= "0" v) op) (assoc s :next-value (str n))
                                  (and v (= "0" v)) (assoc s :value (str n))
                                  :else (assoc s :value (str v n))))))
    (= "AC" n) (swap! state assoc :value "0")
    (= "." n) (swap! state update :value #(cond
                                            (re-matches #"[0-9]+\." %) %
                                            (int? (->float %)) (str % n)
                                            :else %))
    (= "±" n) (swap! state update :value #(str (- (->float %))))
    (= "%" n) (swap! state update :value #(str (/ (->float %) 100)))

    (= "÷" n) (swap! state assoc :operation #(/ (->float %1) (->float %2)))
    (= "×" n) (swap! state assoc :operation #(* (->float %1) (->float %2)))
    (= "–" n) (swap! state assoc :operation #(- (->float %1) (->float %2)))
    (= "+" n) (swap! state assoc :operation #(+ (->float %1) (->float %2)))

    (= "=" n) (swap! state (fn [{:keys [value next-value operation] :as s}]
                             (when (and next-value operation)
                               (-> s
                                 (assoc :value (str (operation value next-value)))
                                 (assoc :next-value nil)
                                 (assoc :operation nil)))))))

(defn number-pad [state]
  [:div.number-pad
   (map-indexed
    (fn [idx n]
      [button
       {:on-click #(handle-click state n)
        :key (str idx n)}
       n])
    pad-nums)])
