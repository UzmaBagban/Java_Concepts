package Polymorphism;
public class ConsOL {
    String name;
    int age;
    String gender;

//constructor1
    ConsOL(){
    }
//constructor 2
    ConsOL(String name, int age){
        this.name = name;
        this.age = age;

    }

//constructor 3
    ConsOL(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;

    }
//display method
    public void display(){
        System.out.println("name is " + name);
        System.out.println("age is " + age);
        System.out.println("gender is " + gender + "\n");
    }
}

class main{
    public static void main(String[] args) {
        ConsOL obj1 = new ConsOL();
        obj1.display();

        ConsOL obj2 = new ConsOL("UZMA", 25);
        obj2.display();

        ConsOL obj3 = new ConsOL("Maaz", 30, "Male");
        obj3.display();

    }
}