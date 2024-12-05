package INTERFACE;

interface Canfly{
    void fly();
}

interface Canswim{
    void swim();
}

class duck implements Canfly, Canswim{
    public void fly(){
        System.out.println("duck can fly");
    }
    public void swim(){
        System.out.println("duck can swim");
    }
}
public class inheritanceInterface {
    public static void main(String[] args) {
        duck obj1 = new duck();
        obj1.fly();
        obj1.swim();
    }
}