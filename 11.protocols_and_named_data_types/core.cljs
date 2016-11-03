;; Protocols are similar to interfaces
;; A protocol is a *named set* of *named methods* and their *signatures*, defined using defprotocol

(defprotocol Book     ;; protocol name
  (next-page [this])  ;; protocol method with signature
  (prev-page [this])  ;; protocol method with signature
  (read-page [this])) ;; protocol method with signature


;; Types
;; When to use? For programming constructs

(defprotocol Reducible
  (reduce [this f]))

(defprotocol Serializable
  (to-string [this]))


(deftype Array [& items] ;; type name
  Reducible              ;; protocol name
  (reduce [this f]       ;; implement protocol methods
    ...)
  Serializable
  (to-string [this]
    ...))

(deftype Object [& pairs]
  Reducible
  (reduce [this f]
    ...)
  Serializable
  (to-string [this]
    ...))


(def arr (Array. 1 2 3))
(def obj (Object. ["key" "value"]))

(reduce arr +)
(reduce obj (fn [agg [_ val]] (+ agg val)) 0)

(to-string arr)
(to-string obj)


;; Records
;; When to use? For domain constructs that need a custom type

(defprotocol Book
  (next-page [this])
  (prev-page [this])
  (read-page [this]))


(defrecord Bible [title pages]
  Book
  (next-page [this]
    ...)
  (prev-page [this]
    ...)
  (read-page [this]
    ...))


(def bible (Bible. "The Bible" []))

(next-page bible)
(prev-page bible)
(read-page bible)

(:title bible) ;; "The Bible"
(:pages bible) ;; []
