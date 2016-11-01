;; Destructuring can be done in both `let` bindings and
;; function parameters


(let [[a b c] [1 2 3]]
  (println a b c)) ;; 1 2 3

(let [[a _ c] [1 2 3]]
  (println a c)) ;; 1 3

(let [[a b & args] [1 2 3 4]]
  (println a b args)) ;; 1 2 [3 4]

(let [[a b :as v] [1 2 3 4]]
  (println a b v)) ;; 1 2 [1 2 3 4]



(let [{val :a} {:a 1 :b 2}]
  (println val)) ;; 1

(let [{val :c :or {val 3}} {:a 1 :b 2}]
  (println val)) ;; 3

(let [{val :a :as m} {:a 1 :b 2}]
  (println val m)) ;; 3 {:a 1 :b 2}

(let [{:keys [a b]} {:a 1 :b 2}]
  (println a b)) ;; 1 2
