package org.autotest.operators.constants;

import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtLiteral;
import spoon.reflect.declaration.CtElement;

import java.util.Arrays;
import java.util.List;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#EXPERIMENTAL_CRCR
 *
 * Este operador reemplaza los valores de las constantes por uno.
 */
public class OneConstantMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        if (!(candidate instanceof CtLiteral)) {
            return false;
        }

        CtLiteral op = (CtLiteral)candidate;
        String type = op.getType().toString();
        List<String> targetTypes = Arrays.asList(
                "int"
        );

        if (!targetTypes.contains(type)) {
            return false;
        }

        if (op.getValue().toString().equals("1")) {
            // Para evitar generar mutantes inválidos, ignoramos los literales que ya son 1.
            return false;
        }

        return true;
    }

    @Override
    public void process(CtElement candidate) {
        CtLiteral op = (CtLiteral)candidate;
        op.setValue(op.getFactory().Code().createLiteral(1));
    }

    @Override
    public String describeMutation(CtElement candidate) {
        CtLiteral op = (CtLiteral)candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getValue().toString() + " por 1" +
                " en la línea " + op.getPosition().getLine() + ".";
    }
}
