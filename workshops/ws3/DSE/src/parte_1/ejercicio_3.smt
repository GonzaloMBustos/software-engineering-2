; Ejercicio 3
; a1 = 16 mod 2
; a2 = 16 dividido por 4
; a3 = resto de la división entera de 16 por 5

(declare-const a1 Real)
(declare-const a2 Real)
(declare-const a3 Real)
(assert (= a1 (mod 16 2)))
(assert (= a2 (div 16 4)))
(assert (= a3 (rem 16 5)))
(check-sat)
(get-model)

