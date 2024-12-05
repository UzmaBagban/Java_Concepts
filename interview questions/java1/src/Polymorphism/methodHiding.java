package Polymorphism;

public class methodHiding {
    public static void main(String[] args){
//Directly calls the static method in the child class
        child.display();
//Directly calls the static method in the parent class
        parent.display();
//obj3 is a reference of type parent
//but it points to an instance of child.
    parent obj3 = new child();
// Since display() is a static method.
// It is resolved at compile time
// based on the reference type, not the object type.
// Therefore, parent.display() is called
    obj3.display();
    }

}
class parent{
    static void display(){
        System.out.println("this  is parent method");
    }
}
class child extends parent{
    static void display(){
        System.out.println("this is child method");
    }
}