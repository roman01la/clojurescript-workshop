(defn init-plugin!
 ([selector]
  (init-plugin! selector nil nil))
 ([selector opts]
  (init-plugin! selector opts nil))
 ([selector opts meta]
  (js/$.plugin selector opts meta)))
