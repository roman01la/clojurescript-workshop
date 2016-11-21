;; Develop ticketing system using multimethods
;; which prints a ticket either for adults or children

;; test
(print-ticket {:name "John Doe" :age 31}) ;; "Adult: John Doe"
(print-ticket {:name "Mark Piper" :age 11}) ;; "Child: Mark Piper"
