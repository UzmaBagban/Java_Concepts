package Constructor;

public class cons_No_Inherit {
    public static void main(String[] args) {
        dog obj1 =  new dog();
      //  Animal dog = new dog("Buddy");--error
        System.out.println();
        Animal obj2 = new dog("buddy");

    }

}
class Animal{
    public Animal(){
        System.out.println("I am default constructor of animal class");
    }
    public Animal(String animal){
        System.out.println("i am paramatrized constructor of animal class " + animal);
    }
}
class dog extends Animal{
    public dog(){
        System.out.println("i am  deafult dog constructor");
    }
    //can call animal class paramatrized constructor with super keyword
    public dog(String animal){
        super(animal);
        System.out.println("i am paramtrized dog constructor");
    }
}
