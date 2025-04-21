package HelloException;

public abstract class BinaryExpression extends Expression {
    protected Expression left;
    protected Expression right;

    /**
     * BinaryExpression():
     * khoi tao co tham so.
     */

    public BinaryExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }

    /**
     * toString():
     * to string.
     */

    @Override
    public abstract String toString();

    /**
     * evaluate():
     * evaluate.
     */

    @Override
    public abstract double evaluate();
}
