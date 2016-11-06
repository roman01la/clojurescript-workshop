(ns calculator.components.app
  (:require [reagent.core :as r]
            [calculator.components.base :refer [ctrl-panel input]]
            [calculator.components.pad :refer [number-pad]]))

(defn app []
  ;; local state
  (let [state (r/atom {:value "0"
                       :next-value nil
                       :operation nil})]
    (fn []
      (let [{:keys [value next-value]} @state]
        [:div.container
         [:div.header
          [ctrl-panel]
          [input {:value (or next-value value)
                  :read-only true}]]
         [number-pad state]]))))
