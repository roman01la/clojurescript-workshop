;; Object
(js-obj "key" "val")
#js {"key" "val"}

;; Array
(array 1 2 3)
#js [1 2 3]

(make-array 3) ;; new Array(3)

;; get/set & delete
(.-textContent element)
(.. object -nested -value)

(set! (.-textContent element) "Hey!")
(set! (.. object -nested -value) "Hey!")

(js-delete object "prop")


;; Convert data structures
(clj->js {:a 1}) ;; {"a": 1}

(js->clj #js {"a" 1}) ;; {"a" 1}
(js->clj #js {"a" 1} :keywordize-keys true) ;; {:a 1}


;; Use JavaScript namespace
;; js == window
(js/setTimeout #(println "Hey!") 1000)
(js/console.log "Hey!")
(.html (js/jQuery "#myDiv") "Hi!")
