# Taller #1 - Mutation Analysis

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Resultados de generación de mutantes

1. ¿Cuántos mutantes se generaron en total?
   - Respuesta: 71 mutantes

2. ¿Qué operador de mutación generó más mutantes? ¿Cuántos y por qué?
   - Respuesta: Tanto TrueConditionalsMutator como FalseConditionalsMutator generaron 10 mutantes cada uno.
     Esto se debe a que existen más guardas candidatas para mutar en comparación con otros posibles candidatos para los demás operadores.
     Dado que ambos operadores afectan las mismas guardas, tiene sentido que generen la misma cantidad de mutantes.

3. ¿Qué operador de mutación generó menos mutantes? ¿Cuántos y por qué?
   - Respuesta: El operador que generó menos mutantes fue FalseReturnsMutator, con solo 2 mutantes. Esto se debe a que la cantidad de candidatos procesables (es decir, la cantidad de `return true`) es mucho menor al resto.
 Si hubiera más instancias para mutar, este número aumentaría, pero en este caso no es así.

---

## Ejercicio 2: Evaluación de test suites

1. ¿Cuántos mutantes vivos y muertos encontraron cada uno de los test suites?
   - **StackTests1**:
     - Mutantes vivos: 54
     - Mutantes muertos: 17
   - **StackTests2**:
     - Mutantes vivos: 38
     - Mutantes muertos: 33

2. ¿Cuál es el mutation score de cada test suite?
   - **StackTests1**: 23%
   - **StackTests2**: 46%

---

## Ejercicio 3: Mejora del test suite

1. ¿Cuál es el mutation score logrado para los tests de StackTests3?
   - Respuesta: 94%

2. ¿Cuántos mutantes vivos y muertos encontraron?
   - Mutantes vivos: 4
   - Mutantes muertos: 67

3. Comente cuáles son todos los mutantes vivos que quedaron y por qué son equivalentes al programa original (si no lo fueran, todavía es posible mejorar el mutation score).
   - Respuesta:
   - `StackArMutated3396` : La operación de mutación realizada en este caso es el TrueReturnsMutator, que reemplaza False por True en la línea 82 del archivo StackAr.java. Sin embargo, la guarda `(readIndex != other.readIndex)` siempre resulta ser falsa, lo que significa que la modificación no altera semánticamente el código del programa.
   -  `StackArMutated8246` : La operación de mutación realizada en este caso es el FalseConditionalsMutator, que reemplaza `readIndex != other.readIndex` por False en la línea 81 del archivo StackAr.java. Pero como se comentó anteriormente, al ser siempre False pues `readIndex` es inaccesible, dicha modificación nos da un programa equivalente.
   - `StackArMutated9417` : La operación de mutación realizada en este caso es el FalseConditionalsMutator, que reemplaza `this == obj` por False en la línea 72 del archivo StackAr.java. Este caso nos da un programa equivalente, dado que un mismo objeto no puede tener atributos diferentes en un mismo contexto.
   - `StackArMutated7722`  : La operación de mutación realizada en este caso es el MathMutator, que reemplaza `*` por `/` en la línea 65 del archivo StackAr.java. Dado que la operación original es `31 * 1` , al realizar el reemplazo, obtendremos `31 / 1`. Como ambos cálculos retornan el mismo valor, la modificación resulta indetectable.

4. ¿Cuál es el instruction coverage promedio que lograron para las clases mutadas?
   - Respuesta: 64%

5. ¿Cuál es el peor instruction coverage que lograron para una clase mutada? ¿Por qué creen que sucede esto?
   - Respuesta: 5%. Esto sucede ya que el mutante modifica un candidato que se encuentra en la primer línea de código ejecutada en la creación de un nuevo stack, por lo tanto no requiere recorrer el resto del programa.
