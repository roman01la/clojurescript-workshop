(ns calculator.core
  (:require [reagent.core :as r]))

(enable-console-print!)

(defonce app-state (r/atom {:text "Hello world!"}))

(defn hello-world []
  [:h1 (:text @app-state)])

(r/render-component
  [hello-world]
  (. js/document (getElementById "app")))
