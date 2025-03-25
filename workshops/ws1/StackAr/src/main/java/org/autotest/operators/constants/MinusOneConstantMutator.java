package org.autotest.operators.constants;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#EXPERIMENTAL_CRCR
 *
 * Este operador reemplaza los valores de las constantes por -1.
 */
public class MinusOneConstantMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtLiteral)) {
            return false;
        }

        CtLiteral op = (CtLiteral)candidate;
        String type = getLiteralType(op);
        List<String> targetTypes = Arrays.asList(
            "int"
        );

        if (!targetTypes.contains(type)) {
            return false;
        }

        String parentNodeCode = op.getParent().toString();
        // No utilizamos op.getValue().toString() para obtener el valor del literal, sino que revisamos el nodo padre,
        // ya que Spoon representa los literales negativos como dos nodos: uno para el operador de negación y otro
        // para el valor literal. En este caso, verificamos si el nodo padre contiene "-1" para evitar generar 
        // mutantes inválidos, ya que transformar un literal que ya es -1 podría resultar en una expresión 
        // inválida como "--1".
        if (parentNodeCode.contains("-1")) {
            // Para evitar lo comentado anteriormente excluimos el caso.
            return false;
        }

        return true;
    }

    @Override
    public void process(CtElement candidate) {
        CtLiteral op = (CtLiteral)candidate;
        op.setValue(op.getFactory().Code().createLiteral(-1));
    }

    private static String getLiteralType(CtLiteral op) {
        return op.getType().toString();
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtLiteral op = (CtLiteral)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getValue().toString() + " por -1" +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
