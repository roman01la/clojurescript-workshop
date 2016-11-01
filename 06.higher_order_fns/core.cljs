;; Composition & partial application

(def coll [1 2 3 4 5])

;; #1
(reduce + (filter odd? (map inc coll))) ;; 8

;; #2
(def crunch-numbers (comp #(reduce + %)
                          #(filter odd? %)
                          #(map inc %)))

(crunch-numbers coll) ;; 8

;; #3
(def crunch-numbers (comp (partial reduce +)
                          (partial filter odd?)
                          (partial map inc)))

(crunch-numbers coll) ;; 8

;; #4
(->> coll
     (map inc)
     (filter odd?)
     (reduce +)) ;; 8



;; Memoization

(def coll [1 2 3 4 5])

(def crunch-numbers
  (memoize (comp #(reduce + %)
                 #(filter odd? %)
                 #(map inc %))))

(crunch-numbers [1 ... 10000000]) ;; takes some time
(crunch-numbers [1 ... 10000000]) ;; immediately returns cached result
(crunch-numbers [1 ... 10000000]) ;; immediately returns cached result



;; Identity

(identity 5) ;; 5

(filter identity [1 true false 9 0 -1 nil]) ;; (1 true 9 0 -1)



;; Juxtaposition

(def get-name (juxt :fname :lname))

(get-name {:fname "John"
           :lname "Doe"
           :age 43}) ;; ["John" "Doe"]
