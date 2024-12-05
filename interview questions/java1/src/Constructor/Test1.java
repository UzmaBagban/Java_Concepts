package Constructor;
// constructor overloading eg
public class Test1
{
//constructor 1 taking type Object parameter
    Test1(Object obj1) {
        System.out.println("Hello");
    }
//constructor 2 od type Test1
    Test1(Test1 Test1) {
        System.out.println("World");
    }
    public static void main(String[] args)
    {
// In above line we are passing null as the argument to the constructor.
//Java chooses the most specific constructor match.
// Test1(Test1 Test1) is a more specific type match than Object.
// so Java calls this constructor and prints "World"
        Test1 t = new Test1(null);    //object created withh null paramater

//In Java, Object is a built-in class that is the root of the class hierarchy.
//Every class in Java implicitly extends Object. So, when you write new Object()
// you’re creating an instance of this fundamental class.
//new Object() creates an instance of the Object class.
//new Test1(new Object()) calls the Test1 constructor that takes an Object parameter.

        Test1 first = new Test1(new Object());
        Test1 second = new Test1(first);
    }
}
