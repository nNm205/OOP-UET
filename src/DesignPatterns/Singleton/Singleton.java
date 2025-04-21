package DesignPatterns.Singleton;

public final class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton() {
        System.out.println("singleton is created only in this class");
    }

    public static Singleton getInstance() {
        System.out.println("I'm creating an instance of Singleton class");
        return instance;
    }

    public static void getMessage() {
        System.out.println("I'm creating a singleton design pattern");
    }
}

