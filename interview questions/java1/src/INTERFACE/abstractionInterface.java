package INTERFACE;
//this is also package import eg
import ABSTRACTION.exampleInterface;
//for more clarification go to ABSTRACTION.exampleInterface
class Guitar implements exampleInterface {
    public void play(){
        System.out.println("playing the guitar");
    }
}

public interface abstractionInterface {
    public static void main(String[] args) {
        Guitar obj1 = new Guitar();
        exampleInterface obj2 = new Guitar();
        obj1.play();
        obj2.play();
        obj2.cost();
        exampleInterface.tune(); //calling static method
    }

}

