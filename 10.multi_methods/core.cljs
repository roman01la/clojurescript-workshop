(defmulti voice :type)

(defmethod voice :dog [animal]
  (println "Dog says: Woof!"))

(defmethod voice :cat [animal]
  (println "Dog says: Meow!"))

(defmethod voice :cow [animal]
  (println "Dog says: Moo!"))

(defmethod voice :default [animal]
  (println "No such animal type"))
