interface MyInterface {
    final int a = 100;
    default void display() {
        System.out.println("Hello World!!!");
    }
}

public class TestClass implements MyInterface {
    public static void main(String[] args) {
        TestClass test = new TestClass();
        test.display();
        System.out.println(test.a);
    }
}
