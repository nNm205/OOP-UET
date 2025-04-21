class Animal {
    public static void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public static void makeSound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound(); // Output: Animal sound

        Animal dog = new Dog();
        dog.makeSound(); // Output: Animal sound (Static binding)
    }
}