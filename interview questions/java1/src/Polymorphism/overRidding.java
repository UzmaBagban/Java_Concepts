package Polymorphism;

public class overRidding {
    public static void main(String[] args) {

        dog obj = new dog();
        obj.sound();
        System.out.println();
        Animal obj1 = new cat();
        obj1.sound();
        System.out.println();
      //  obj1.fur();
//this will throw error
//bcz u are trying to call fur method which is define in cat class not aniimal
//u are makeing object of cat class but of type animal
// to call fur method u have to make object of cat class with type cat
        if (obj1 instanceof cat) {
            cat obj2 = (cat) obj1;
            obj2.fur();
        }

    }
}

class Animal{
    Animal(){
        System.out.println("i am animal constructor");
    }
    void sound(){
        System.out.println("animal makes sound");
    }
}

class dog extends Animal{
    dog(){
        System.out.println("i am dog constructor");
    }
   @Override
    void sound(){
        System.out.println("dog barks");
    }
}

class cat extends Animal{
    cat(){
        System.out.println("i am cat constructor");
    }
    @Override
    void sound(){
        System.out.println("cat meoww");
    }
    void fur(){
        System.out.println("cat have soft fur");
    }
}
