(ns calculator.core
  (:require [reagent.core :as r]
            [calculator.components.app :refer [app]]))

(enable-console-print!) ;; enable logging with `println`

(r/render-component ;; `ReactDOM.render`
  [app] ;; <App />
  (. js/document (getElementById "app"))) ;; mount target
