package HelloException;

public class Multiplication extends BinaryExpression {
    /**
     * Multiplication():
     * khoi tao co tham so.
     */

    public Multiplication(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString():
     * to string.
     */

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("(").append(left.toString());
        result.append(" * ");
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
        return resultLeft * resultRight;
    }
}
