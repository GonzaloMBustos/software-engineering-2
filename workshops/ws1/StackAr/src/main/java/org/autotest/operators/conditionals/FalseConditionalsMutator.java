package org.autotest.operators.conditionals;

import org.autotest.helpers.BinaryOperatorKindToString;
import org.autotest.operators.MutationOperator;
import spoon.reflect.code.CtBinaryOperator;
import spoon.reflect.code.CtIf;
import spoon.reflect.declaration.CtElement;

/**
 * Operador de mutación basado en https://pitest.org/quickstart/mutators/#REMOVE_CONDITIONALS
 *
 * Este operador reemplaza los valores en las condiciones de guardas por false.
 */
public class FalseConditionalsMutator extends MutationOperator {
    @Override
    public boolean isToBeProcessed(CtElement candidate) {
        // COMPLETAR
        return (candidate instanceof CtIf);
    }

    @Override
    public void process(CtElement candidate) {
        // COMPLETAR
        CtIf condition = (CtIf) candidate;
        condition.setCondition(condition.getFactory().createLiteral(false));
    }

    @Override
    public String describeMutation(CtElement candidate) {
        // COMPLETAR
        CtIf op = (CtIf) candidate;
        return this.getClass().getSimpleName() + ": Se reemplazó " +
                op.getCondition() + " por False en la línea " + op.getPosition().getLine() + ".";
    }
}
