
;; S-expressions (symbolic expressions)
;; Prefix (Polish) notation

 (+ 1 2 3 4 5) ;; 15
; +______________ function
;   1 2 3 4 5____ params

 (max 4 9) ;; 9
; max________ function
;     4 9____ params

;; variable definition
 (def x 1)
; var___________ special form
;     var name__ symbol
;       value___ associated with symbol `x`

;; function definition
; (defn add ...)__________ (def add (fn ...))
(defn add [a b] ; [a b]___ params list
  (+ a b)) ; (+ a b)______ function body

;; function call
(add x 8) ;; 9

;; nested function calls
(+ 4 9 (* 6 8) 1 (/ 81 9)) ;; 71

;; local variables
;; aka `let` & `const` in JavaScript
(let [a 1
      b 2]
  ...)

(println a) ;; Use of undeclared Var cljs.user/a

;; function definition with local variables
(defn say-hi [name]
  (let [msg #(str "Hey, " % "!")]
    (msg name)))

(say-hi "Roman") ;; "Hey, Roman!"

;; rest parameters
(defn sum [a b & params]
  (apply + a b params))

(sum 1 2 3 4 5) ;; 15


;; function shorthand (lambda)
#(+ % %)
;   ^_^______ single argument function

#(+ %1 %2)
;   ^__^_____ 1st & 2nd arguments

#(apply + %&)
;         ^__ rest parameters
