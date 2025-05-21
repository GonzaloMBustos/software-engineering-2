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
