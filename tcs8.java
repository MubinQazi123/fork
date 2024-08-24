// Superclass
class Animal {
    String name = "Animal";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void display() {
        System.out.println("This is an animal");
    }
}

// Subclass
class Dog extends Animal {
    String name = "Dog";

    Dog() {
        // Calling superclass constructor
        super();
        System.out.println("Dog constructor called");
    }

    void display() {
        // Calling superclass method
        super.display();
        System.out.println("This is a dog");
    }

    void printNames() {
        // Accessing superclass variable
        System.out.println("Superclass name: " + super.name);
        System.out.println("Subclass name: " + this.name);
    }
}

// Main class to test the functionality
public class tcs8 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.display();
        dog.printNames();
    }
}
