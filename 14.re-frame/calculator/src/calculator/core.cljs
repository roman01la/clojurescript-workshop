(ns calculator.core
  (:require [reagent.core :as r]
            [re-frame.core :refer [dispatch-sync]]
            [calculator.components.app :refer [app]]
            [calculator.events] ;; import events
            [calculator.subs])) ;; import subscriptions

(enable-console-print!) ;; enable logging with `println`

(dispatch-sync [:initialise-db]) ;; initialise app state

(r/render-component ;; `ReactDOM.render`
  [app] ;; <App />
  (. js/document (getElementById "app"))) ;; mount target
