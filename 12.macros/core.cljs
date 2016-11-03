;; A macro is a function which *runs at compile time*
;; In ClojureScript macros should be defined in .clj or .cljc files

(defmacro infix [[a op b]]
  `(~op ~a ~b))
; ^______________ syntax quote (allows unquoting)
;   ^___^__^_____ unquoting (resolving to associated value)

(infix (1 + 1))
;; after macro expansion step `(+ 1 1)`
;; after compilation step `(js* "(~{} + ~{})" 1 1)`

;; Manual macro expansion
(macroexpand '(infix (1 + 1))) ;; (+ 1 1)
(macroexpand '(+ 1 1)) ;; (js* "(~{} + ~{})" 1 1)
;;           ^___________ quoted expression (code as data)



;; https://github.com/JulianBirch/poppea/blob/master/src/poppea.clj#L12-L29
(defn do-curried [symbol to-fn params]
  (let [result (split-with (complement vector?) params)
        [[name doc meta] [args & body]] result
        [doc meta] (if (string? doc) [doc meta] [nil doc])
        body (if meta (cons meta body) body)
        arity-for-n #(-> % inc (split-at args) (to-fn body))
        arities (->>
                 (range 0 (count args))
                 (map arity-for-n)
                 reverse)
        before (keep identity [symbol name doc])]
    (concat before arities)))

(defmacro defn-curried [& params]
  (do-curried 'defn curry params))

;; Usage
(defn-curried listen [event handler]
  (subscribe event handler))

(def on-ready (listen "ready"))

(on-ready #(println "READY!"))
(on-ready initialize-app)
