;; A Clojure multimethod is a combination
;; of a dispatching function, and one or more methods.

;; Execution algorithm `(voice {:type :cat})`

;; 1. Apply arguments to dispatching function
;; 2. Get dispatching value
;; 3. Find a method associated with dispatching value
;; 4. Apply arguments to a method

;; If there's no such a method, call :default method
;; If there's no :default method, throw an error

;; multimethod definition
(defmulti voice :type)
;;        ^____________ multimethod name
;;              ^______ dispatching function

;; method definition
(defmethod voice :dog [animal] ;; method arguments
  ;;       ^_____________________ multimethod name
  ;;             ^_______________ dispatching value
  (println "Dog says: Woof!")) ;; method body

(defmethod voice :cat [animal]
  (println "Cat says: Meow!"))

(defmethod voice :cow [animal]
  (println "Cow says: Moo!"))

(defmethod voice :default [animal]
  (println "No such animal type"))

(voice {:type :cat}) ;; "Cat says: Meow!"
(voice {:type :pig}) ;; "No such animal type"
