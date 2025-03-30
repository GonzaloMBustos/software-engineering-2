# Taller #2 - Random Testing

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Generación de Tests con Randoop

1. ¿Cuántos casos de test produjo Randoop?
   - Respuesta: Randoop produjo 579 casos de test.

2. ¿Hay casos de test que fallan?
   - Respuesta: No, ninguno de los test producidos por Randoop falló.

3. ¿Cuál es el instruction coverage alcanzado por los tests generados para la clase StackAr?
   - Respuesta: El instruction coverage alcanzado por los tests generados fue de 72%.

---

## Ejercicio 2: Validación de StackAr y detección de fallas

ACLARACIÓN: Durante la clase probamos Randoop por 1 minuto en distintas computadoras, con distintas versiones de nuestro codigo, y no nos generó ningún caso de test con falla.
Consultamos con el JTP y nos sugirió que probáramos aumentando el tiempo. Probamos con 3 minutos y recién ahí tuvimos casos de test que fallaron.
Sin embargo, luego de hacer la prueba con 3 minutos, intentamos regresando a 1 minuto y si se lograron encontrar errores.

1. Ejecutar Randoop por 1 minuto sobre StackAr y correr los tests generados:
   - ¿Hay casos de test que fallan? ¿Cuántos?
     - Respuesta: Los casos de test que fallaron fueron 330.
   - Si hay tests que fallan, analizar y explicar por qué fallan.
     - Respuesta: La falla se debía a que el método pop solo disminuía el readIndex, lo cual hacía que mirara a la siguiente posición del StackAr, pero nunca eliminaba los elementos.
       
2. Reparar StackAr si es necesario, volver a ejecutar Randoop y confirmar que no haya tests fallando.
   - Descripción de las modificaciones realizadas:
     - Respuesta: Modificamos el pop, para que realice lo necesario, de modo que al ejecutarla, retorna el elemento del tope de la pila, en su posición asigna el valor null, y decrementa el readIndex.
       
3. Reportar el instruction coverage alcanzado por los últimos casos de tests generados por Randoop para la clase StackAr.
   - Respuesta: El instruction coverage alcanzado fue del 84%.

---

## Ejercicio 3: Análisis de Mutantes con Pitest

1. Ejecutar Pitest sobre el último test suite generado por Randoop:
   - ¿Cuántos mutantes construye Pitest? ¿Cuál es el mutation score?
     - Respuesta: Pitest contruó 36 mutantes. Dando un mutation score del 78%.

2. Extender manualmente el test suite para mejorar el mutation score con Pitest:
   - ¿Cuál es el mejor mutation score que se pudo obtener?
     - Respuesta: El mejor mutation score que pudimos obtener fue del 94%.
   - Si hay mutantes equivalentes, explicar cuáles son y justificar por qué son equivalentes.
     - Respuesta: Obtuvimos 2 mutantes equivalentes.
        - La operación de mutación realizada que reemplaza `*` por `/` en el calculo del hashCode del archivo StackAr.java. Dado que la operación original es `31 * 1` , al realizar el reemplazo, obtendremos `31 / 1`. Como ambos cálculos retornan el mismo valor, la modificación resulta indetectable.
        - La operación de mutación realizada en este caso es el FalseConditionalsMutator, que reemplaza `readIndex != other.readIndex` por False en la línea 81 del archivo StackAr.java. Pero como se comentó anteriormente, al ser siempre False pues `readIndex` es inaccesible, dicha modificación nos da un programa equivalente.
