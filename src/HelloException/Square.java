package HelloException;

public class Square extends Expression {
    private Expression expression;

    /**
     * Square():
     * khoi tao co tham so.
     */

    public Square(Expression expression) {
        this.expression = expression;
    }

    /**
     * toString():
     * to string.
     */

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("(").append(expression.toString()).append(") ^ 2");
        return result.toString();
    }

    /**
     * evaluate():
     * evaluate.
     */

    @Override
    public double evaluate() {
        double base = expression.evaluate();
        return base * base;
    }
}
