(ns calculator.components.app
  (:require [re-frame.core :refer [subscribe]]
            [calculator.components.base :refer [ctrl-panel input]]
            [calculator.components.pad :refer [number-pad]]))

(defn app []
  (let [[value next-value] @(subscribe [:values])] ;; subscribe to state changes
    [:div.container
     [:div.header
      [ctrl-panel]
      [input {:value (or next-value value)
              :read-only true}]]
     [number-pad]]))
