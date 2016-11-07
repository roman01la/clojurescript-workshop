(ns calculator.subs
  (:require [re-frame.core :refer [reg-sub]]))

(reg-sub ;; register subscription
  :values ;; subscription name
  (fn [db _]
    ((juxt :value :next-value) db))) ;; define subscription data source
