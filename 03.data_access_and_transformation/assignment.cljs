;; Given a collection of bank accounts
;; produce a collection of strings of the following format:
;; "{{FirstName}} {{LastName}}: {{FinalBalance}}"
;; where {{FinalBalance}} is a result
;; of applying {{InitialBalance}} to a history of account's transactions

(def users
  [{:fname "John"
    :lname "Doe"
    :initial-balance 4000
    :tx-history [-100
                 +340
                 -800
                 -1200
                 +900
                 -11
                 -140]}
   {:fname "Marta"
     :lname "Brown"
     :initial-balance 100
     :tx-history [+200
                  -400
                  -14
                  +90
                  -18]}
   {:fname "Hannah"
     :lname "Woods"
     :initial-balance 0
     :tx-history [+90
                  -19
                  -45
                  +1000
                  -450]}])


;; test
(count-balance users) ;; ("John Doe: 2989" "Marta Brown: -42" "Hannah Woods: 576")
