;; falsy values
nil
false

(if true ;; ____________ condition
  (println true) ;; ____ if true
  (println false)) ;; __ else

(if (> 1 0)
  (println ">")
  (println "<"))

(if-not false ;; ___ (if (not false) ...)
  ...)

;; when you don't need `else`
(when true
  (println true))

(when-not false ;; ___ (when (not false) ...)
  (println true))

;; like switch...case in JavaScript
(case x
  1 ...
  "Hello!" ...
  [1 2 3] ...
  "default")

(cond
  (= x 1) ...
  (true? 1) ...
  (pos? 0) ...
  :else "default")

;; looping
(loop [a 0 b 1]
  (println a)
  (when (< b 100)
    (recur b (+ a b)))) ;; loop again with new `a` and `b`

;; recursive function
(defn fib [a b until]
  (println a)
  (when (< b until)
    (recur b (+ a b) until))) ;; call recursively with new `a` and `b`
