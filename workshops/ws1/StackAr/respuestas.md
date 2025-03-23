# Taller #1 - Mutation Analysis

## Instrucciones
Completar este documento con las respuestas correspondientes a los ejercicios planteados en el enunciado del taller.

---

## Ejercicio 1: Resultados de generación de mutantes

1. ¿Cuántos mutantes se generaron en total?
   - Respuesta: 71 mutantes

2. ¿Qué operador de mutación generó más mutantes? ¿Cuántos y por qué?
   - Respuesta: TrueConditionalsMutator y FalseConditionalsMutator generaron 10 mutantes cada uno,
   - y esto se debe a que hay mas guardas candidatas que otros candidatos a mutar para cualquiera de los otros operadores.
   - Como TrueConditionalsMutator y FalseConditionalsMutator ambos mutan las mismas guardas, tiene sentido que ambos compartan cantidad
   - de mutantes generados.

3. ¿Qué operador de mutación generó menos mutantes? ¿Cuántos y por qué?
   - Respuesta: Los operadores que generaron menos mutantes fueron: FalseReturnsMutator.
   - Este operador generó 2 mutantes dado que la cantidad procesable de candidatos (es decir, la cantidad de `return true`) es mucho menor al resto.
   - Si hubiera mas instancias para mutar, estos valores incrementarian, pero no es el caso.


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
   - StackArMutated3396 (TrueReturnsMutator: Se reemplazó false por true en la línea 82.) => readIndex inaccessible
   - StackArMutated9417 (FalseConditionalsMutator: Se reemplazó this == obj por False en la línea 72.) => same object cannot have different attributes
   - StackArMutated8246 (FalseConditionalsMutator: Se reemplazó readIndex != other.readIndex por False en la línea 81.) => readIndex inaccessible
   - StackArMutated7722 (MathMutator: Se reemplazó * por / en la línea 65.) => 31 * 1 == 31 / 1. Son valores hardcodeados, por lo tanto es indetectable

4. ¿Cuál es el instruction coverage promedio que lograron para las clases mutadas?
   - Respuesta: 64%

5. ¿Cuál es el peor instruction coverage que lograron para una clase mutada? ¿Por qué creen que sucede esto?
   - Respuesta: 5%. Esto sucede ya que el mutante modifica un candidato que se encuentra en la primer linea de codigo ejecutada en la creacion
   - de un nuevo stack, por lo tanto no requiere recorrer el resto.
