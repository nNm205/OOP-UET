package HelloException;

public class ExpressionTest {
    /**
     * main():
     * main.
     */

    public static void main(String[] args) {
        // (10 ^ 2 - 3 + 4 * 3) ^ 2

        Expression ten = new Numeral(10);
        Expression three = new Numeral(3);
        Expression four = new Numeral(4);

        Square tenSquared = new Square(ten);
        Subtraction sub = new Subtraction(tenSquared, three);
        Multiplication mul = new Multiplication(four, three);
        Addition add = new Addition(sub, mul);
        Square newSquare = new Square(add);

        System.out.println(newSquare.evaluate());
        System.out.println(newSquare.toString());
    }
}
