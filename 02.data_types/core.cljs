;; Number
1
4.5
+1
-100
33e8
12e-14
3.2e-4


;; String
"Single line string"
"Multiline
    string" ;; "Multiline\n    string"


;; Character
\g ;; "g"


;; Keyword
:foo
(keyword "foo") ;; :foo

:zero?
:visible?


;; Symbol
'x
(symbol "x")
;; (def x 1)
;;      ^_____ symbol


;; List
(list 1 :foo "bar")
'(1 :foo "bar")

(inc 1) ;; 2
'(inc 1) ;; (inc 1)


;; Vector
;; (efficient index access)
(vector 1 :foo "bar")
[1 :foo "bar"]


;; Map
(hash-map :a 1 :b 2)
{:a 1 :b 2}


;; Set
(hash-set 1 2 3 4 4)
#{1 2 3 4 4} ;; clojure.lang.ExceptionInfo: Duplicate key: 4

(into #{} [1 2 3 4 4]) ;; #{1 2 3 4}
