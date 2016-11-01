;; Atom is a reference type and is used for shared state

;; define an atom which holds a value of `0`
(def state (atom 0))

;; set atom's value to `100`
(reset! state 100) ;; 100

;; update atom's value with a function
(swap! state inc) ;; 101

;; read atom's value
(deref state) ;; 101
@state ;; 101

;; observe chages
(add-watch state :logger (fn [key st old-val new-val]
                           (println "New value is:" new-val)))

(swap! state inc) ;; "New value is: 102"
(swap! state inc) ;; "New value is: 103"

(remove-watch state :logger)
