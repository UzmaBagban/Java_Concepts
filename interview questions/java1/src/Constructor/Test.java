package Constructor;

public class Test {
    public static void main(String[] args) {
        // Creating an object with another object
        // 2 objects will be created

        // The first object (inner) will be created
        // It will call the default constructor
        // There is no variable where this object's reference can be saved
        // So, its reference is passed to the outer Test object

        // The outer Test object takes the inner Test object as a parameter
        // This calls the parameterized constructor
        // The second object (outer) is created and stored in 'temp'

        // The first object remains in heap memory as no variable is used to store its reference
        // There is no reference for the first object, so it is eligible for garbage collection
        Test temp = new Test(new Test());
    }

    // Default constructor
    Test() {
        System.out.println("Calling default constructor");
    }

    // Parameterized constructor
    Test(Test cons) {
        System.out.println("Calling parameterized constructor, taking parameter of type Test");
    }
}
