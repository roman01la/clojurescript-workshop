(ns calculator.components.base)

(defn input [props]
  [:div.field
   [:input.input props]])

(defn button [props child]
  [:button.button props child])

(defn window-ctrl [type]
  [:div {:class (str "window-ctrl " type)}])

(defn ctrl-panel []
  [:div.ctrl-panel
   (map
    (fn [type] ^{:key type} [window-ctrl type])
    ["close" "min" "max"])])
