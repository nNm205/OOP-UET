package HelloException;

public class Numeral extends Expression {
    private double value;

    /**
     * Numeral():
     * khoi tao ko tham so.
     */

    public Numeral() {

    }

    /**
     * Numeral():
     * khoi tao co tham so.
     */

    public Numeral(double value) {
        this.value = value;
    }

    /**
     * toString():
     * to string.
     */

    @Override
    public String toString() {
        if (value == (int) value) {
            return String.valueOf((int) value);
        } else {
            return String.valueOf(value);
        }
    }

    /**
     * evaluate():
     * evaluate.
     */

    @Override
    public double evaluate() {
        return value;
    }
}
