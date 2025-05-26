package at.dataflow.zeroanalysis;

/**
 * This enum represents the possible values of the zero analysis for a variable.
 */
public enum ZeroAbstractValue {

    /**
     * We don't have information about the variable.
     */
    BOTTOM("bottom"),

    /**
     * The variable is positive.
     */
    POSITIVE("positive"),

    /**
     * The variable is zero.
     */
    ZERO("zero"),

    /**
     * The variable is negative.
     */
    NEGATIVE("negative"),

    /**
     * The variable is top (can be any value).
     */
    TOP("top");


    /**
     * The name of the ZeroAbstractValue.
     */
    private final String name;

    @Override
    public String toString() {
        return this.name;
    }

    ZeroAbstractValue(String name) {
        this.name = name;
    }

    /**
     * Returns the result of the addition between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the addition.
     */
    public ZeroAbstractValue add(ZeroAbstractValue another) {
        /**
        Para poder realizar el ZeroAnalysis, vamos a necesitar como base implementar las operaciones entre los simbolos del reticulado.
        En nuestro caso, el reticulado es el del signo, por lo tanto sabemos por lo visto en clase que los simbolos son:
        - BOTTOM: ⊥
        - POSITIVE: +
        - ZERO: 0
        - NEGATIVE: -
        - TOP: ⊤
        Y tambien sabemos por lo visto en clase cómo es que se comportan las operaciones entre ellos.
        De esta manera, implementamos las operaciones de suma, resta, multiplicación y división tal como se especifica en las diapositivas de la clase.
        En este caso, comenzamos con la suma.
        */
        if (this == ZeroAbstractValue.BOTTOM || another == ZeroAbstractValue.BOTTOM) {
            return ZeroAbstractValue.BOTTOM;
        }
        if (this == ZeroAbstractValue.TOP || another == ZeroAbstractValue.TOP) {
            return ZeroAbstractValue.TOP;
        }
        if (this == ZeroAbstractValue.ZERO) {
            return another;
        }
        if (another == ZeroAbstractValue.ZERO) {
            return this;
        }
        if (this == another && (this == ZeroAbstractValue.NEGATIVE || this == ZeroAbstractValue.POSITIVE)) {
            return this;
        }
        return ZeroAbstractValue.TOP;
    }

    /**
     * Returns the result of the division between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the division.
     */
    public ZeroAbstractValue divideBy(ZeroAbstractValue another) {
        /**
        Implementamos la división.
        */
        if (this == ZeroAbstractValue.BOTTOM || another == ZeroAbstractValue.BOTTOM) {
            return ZeroAbstractValue.BOTTOM;
        }
        if (another == ZeroAbstractValue.ZERO) {
            return ZeroAbstractValue.BOTTOM;
        }
        if (this == ZeroAbstractValue.ZERO && (another == ZeroAbstractValue.POSITIVE || another == ZeroAbstractValue.NEGATIVE)) {
            return ZeroAbstractValue.ZERO;
        }

        return ZeroAbstractValue.TOP;
    }

    /**
     * Returns the result of the multiplication between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the multiplication.
     */
    public ZeroAbstractValue multiplyBy(ZeroAbstractValue another) {
        /**
        Implementamos la multiplicación.
        */
        if (this == ZeroAbstractValue.BOTTOM || another == ZeroAbstractValue.BOTTOM) {
            return ZeroAbstractValue.BOTTOM;
        }
        if (this == ZeroAbstractValue.ZERO || another == ZeroAbstractValue.ZERO) {
            return ZeroAbstractValue.ZERO;
        }
        if (this == another) {
            return ZeroAbstractValue.POSITIVE;
        }
        if ((this == ZeroAbstractValue.NEGATIVE && another == ZeroAbstractValue.POSITIVE)
                || (this == ZeroAbstractValue.POSITIVE && another == ZeroAbstractValue.NEGATIVE)) {
            return ZeroAbstractValue.NEGATIVE;
        }

        return ZeroAbstractValue.TOP;
    }

    /**
     * Returns the result of the subtraction between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the subtraction.
     */
    public ZeroAbstractValue substract(ZeroAbstractValue another) {
        /**
        Implementamos la resta.
        */
        if (this == ZeroAbstractValue.BOTTOM || another == ZeroAbstractValue.BOTTOM) {
            return ZeroAbstractValue.BOTTOM;
        }
        if (this == ZeroAbstractValue.ZERO) {
            if (another == ZeroAbstractValue.ZERO) return ZeroAbstractValue.ZERO;
            if (another == ZeroAbstractValue.NEGATIVE) return ZeroAbstractValue.POSITIVE;
            if (another == ZeroAbstractValue.POSITIVE) return ZeroAbstractValue.NEGATIVE;
        }

        if (another == ZeroAbstractValue.ZERO) {
            return this;
        }

        if (this == ZeroAbstractValue.POSITIVE && another == ZeroAbstractValue.NEGATIVE) {
            return ZeroAbstractValue.POSITIVE;
        }

        if (this == ZeroAbstractValue.NEGATIVE && another == ZeroAbstractValue.POSITIVE) {
            return ZeroAbstractValue.NEGATIVE;
        }

        return ZeroAbstractValue.TOP;
    }

    /**
     * Returns the result of the merge between this ZeroAbstractValue and another.
     * @param another the other ZeroAbstractValue.
     * @return the result of the merge.
     */
    public ZeroAbstractValue merge(ZeroAbstractValue another) {
        /**
        Finalmente, implementamos la unión.
        Esta operacion es necesaria para aquellos casos donde tenemos ciclos o estructuras de control donde el IN[n]/OUT[n] de un nodo n
        depende de mas de una entrada/salida, por lo que necesitamos definir la union entre los valores resultantes del estudio de ZeroAnalysis de ambos nodos.
        Es decir, nos ayuda en los casos donde tenemos que actualizar el simbolo analizado para cada variable en cada nodo.
        */
        if (this == ZeroAbstractValue.BOTTOM) {
            return another;
        }
        if (another == ZeroAbstractValue.BOTTOM) {
            return this;
        }
        if (this == another) {
            return this;
        }
        return ZeroAbstractValue.TOP;
    }

}
