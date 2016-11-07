(ns calculator.components.pad
  (:require [re-frame.core :refer [dispatch]]
            [calculator.components.base :refer [button]]))

(def pad-nums
  ["AC" "±" "%" "÷"
   7    8   9   "×"
   4    5   6   "–"
   1    2   3   "+"
   0    nil "." "="])

(defn handle-click [n]
  (cond
    (number? n) (dispatch [:set-value n]) ;; dispatch an event

    (= "AC" n)  (dispatch [:clear])
    (= "." n)   (dispatch [:set-dot])
    (= "±" n)   (dispatch [:invert])
    (= "%" n)   (dispatch [:to-percent])

    (= "÷" n)   (dispatch [:set-divide])
    (= "×" n)   (dispatch [:set-multiply])
    (= "–" n)   (dispatch [:set-subtract])
    (= "+" n)   (dispatch [:set-sum])

    (= "=" n)   (dispatch [:calculate])))

(defn number-pad []
  [:div.number-pad
   (map-indexed
    (fn [idx n]
      [button
       {:on-click #(handle-click n)
        :key (str idx n)}
       n])
    pad-nums)])
