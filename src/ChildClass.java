public class ChildClass extends ParentClass {
    private int b;

    public ChildClass(int b) {
        super(1);
        this.b = b;
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass(1);
        System.out.println(obj.b);
    }
}
