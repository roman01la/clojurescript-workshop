;; Vector

(def v [1 2 3 4 5])

(nth v 3) ;; 4
(v 3) ;; 4

(peek v) ;; 5
(pop v) ;; [1 2 3 4]

(conj v 6) ;; [1 2 3 4 5 6]

(subvec v 1 3) ;; [2 3]

(map inc v) ;; (2 3 4 5 6)
(mapv inc v) ;; [2 3 4 5 6]

(mapv #(+ 10 %) v) ;; [11 12 13 14 15]


;; Map

(def m {:a 1 :b 2 :c {:d 3 :e 4}})

(get m :a) ;; 1
(:a m) ;; 1
(m :a) ;; 1
(get-in m [:c :d]) ;; 3

(assoc m :f 5) ;; {:a 1 :b 2 :c {:d 3 :e 4} :f 5}
(assoc-in m [:c :e] 12) ;; {:a 1 :b 2 :c {:d 3 :e 12}}
(dissoc m :a) ;; {:b 2 :c {:d 3 :e 4}}

(update-in m [:c :e] inc) ;; {:a 1 :b 2 :c {:d 3 :e 5}}

(merge {:a 1 :b 2} {:b 5}) ;; {:a 1 :b 5}


(def coll (range 0 6)) ;; (0 1 2 3 4 5)

(map inc coll) ;; (1 2 3 4 5 6)
(filter odd? coll) ;; (1 3 5)
(reduce + coll) ;; 15

(reduce + (filter odd? (map inc coll))) ;; 9

;; threading last macro
(->> coll
     (map inc)
     (filter odd?)
     (reduce +)) ;; 9
