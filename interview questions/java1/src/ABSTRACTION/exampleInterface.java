package ABSTRACTION;

public interface exampleInterface {
    //abstract method
    void play();
    //default method
    default void cost(){
        System.out.println("\ncost is 500 ");
    }
    //static method
    static void tune(){
        System.out.println("Tuning the tune");
    }

}
class Guitar implements exampleInterface {
    public void play(){
        System.out.println("playing the guitar");
    }
}
class main1{
    public static void main(String[] args) {
        Guitar obj1 = new Guitar();
        exampleInterface obj2 = new Guitar();
        obj1.play();
        obj2.play();
        obj2.cost();
        exampleInterface.tune(); //calling static method
    }
}
