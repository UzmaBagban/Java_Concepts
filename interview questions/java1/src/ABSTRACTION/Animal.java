package ABSTRACTION;

import java.util.function.DoubleToIntFunction;

abstract class Animal {
//abstract class can have constructor so just eg of it
    public Animal(){
        System.out.println("hi i am constructor of abstract class");
    }
    //abstract method
    public abstract void makeSound();

    //concrete method
    public void eat(){
        System.out.println("animals eat");
    }
}
class Dog extends Animal{
    Dog(){
        super(); //calling abstract constructor with super keyword
    }
    @Override
    public void makeSound() {
        System.out.println("dog barks");
    }
}



class main{
    public static void main(String[] args) {
        Dog obj1 = new Dog();  //simple object creation
        obj1.makeSound();
        obj1.eat();
//showing abstraction + polymorhism together
//obj2 object is created of class Dog and type Animal
        Animal obj2 = new Dog();
        obj2.makeSound();
        obj2.eat();

    }
}
