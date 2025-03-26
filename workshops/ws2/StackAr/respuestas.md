# Taller #2 - Random Testing

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Generación de Tests con Randoop

1. ¿Cuántos casos de test produjo Randoop?
   - Respuesta: 616

2. ¿Hay casos de test que fallan?
   - Respuesta: No

3. ¿Cuál es el instruction coverage alcanzado por los tests generados para la clase StackAr?
   - Respuesta: 83%

---

## Ejercicio 2: Validación de StackAr y detección de fallas

1. Ejecutar Randoop por 1 minuto sobre StackAr y correr los tests generados:
   - ¿Hay casos de test que fallan? ¿Cuántos?
     - Respuesta: Si. 330.
   - Si hay tests que fallan, analizar y explicar por qué fallan.
     - Respuesta: porque el pop simplemente corre el readIndex, pero no elimina los elementos del stack

2. Reparar StackAr si es necesario, volver a ejecutar Randoop y confirmar que no haya tests fallando.
   - Descripción de las modificaciones realizadas:
     - Respuesta: se modifico el pop para asignar null al elemento eliminado

3. Reportar el instruction coverage alcanzado por los últimos casos de tests generados por Randoop para la clase StackAr.
   - Respuesta: 84%

---

## Ejercicio 3: Análisis de Mutantes con Pitest

1. Ejecutar Pitest sobre el último test suite generado por Randoop:
   - ¿Cuántos mutantes construye Pitest? ¿Cuál es el mutation score?
     - Respuesta: 36, 78%

2. Extender manualmente el test suite para mejorar el mutation score con Pitest:
   - ¿Cuál es el mejor mutation score que se pudo obtener?
     - Respuesta: 94%
   - Si hay mutantes equivalentes, explicar cuáles son y justificar por qué son equivalentes.
     - Respuesta: 2 mutantes equivalentes.
     - La operación de mutación realizada que reemplaza `*` por `/` en el calculo del hashCode del archivo StackAr.java. Dado que la operación original es `31 * 1` , al realizar el reemplazo, obtendremos `31 / 1`. Como ambos cálculos retornan el mismo valor, la modificación resulta indetectable.
     - La operación de mutación realizada en este caso es el FalseConditionalsMutator, que reemplaza `readIndex != other.readIndex` por False en la línea 81 del archivo StackAr.java. Pero como se comentó anteriormente, al ser siempre False pues `readIndex` es inaccesible, dicha modificación nos da un programa equivalente.
