package HelloException;

public class Division extends BinaryExpression {
    /**
     * Division():
     * khoi tao co tham so.
     */

    public Division(Expression left, Expression right) {
        super(left, right);
    }

    /**
     * toString():
     * to string.
     */

    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("(").append(left.toString());
        result.append(" / ");
        result.append(right.toString()).append(")");
        return result.toString();
    }

    /**
     * evaluate():
     * evaluate.
     */

    public double evaluate() {
        double result = 0;
        try {
            double resultLeft = left.evaluate();
            double resultRight = right.evaluate();
            if (resultRight == 0) {
                throw new ArithmeticException("Lỗi chia cho 0");
            }
            return resultLeft / resultRight;
        } catch (ArithmeticException e) {
            System.err.println(e.getMessage());
            throw e;
        }
    }
}
