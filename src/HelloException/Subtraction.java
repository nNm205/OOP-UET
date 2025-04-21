package HelloException;

public class Subtraction extends BinaryExpression {
    /**
     * Subtraction():
     * khoi tao co tham so.
     */

    public Subtraction(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString():
     * to string.
     */

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("(").append(left.toString());
        result.append(" + -");
        result.append(right.toString()).append(")");
        return result.toString();
    }

    /**
     * evaluate():
     * evaluate.
     */

    public double evaluate() {
        double resultLeft = left.evaluate();
        double resultRight = right.evaluate();
        return resultLeft - resultRight;
    }
}
