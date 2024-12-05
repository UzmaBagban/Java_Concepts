
package INTERFACE;

public interface PolyInterfaceShape {
    void draw(); //abstract method
    //abstract method with method overloading concept
    void draw(String doll);
}
class Circle implements PolyInterfaceShape{
    public void draw(){
        System.out.println("This is circle");
    }
    //method overloading  + method overriding
    public void draw(String doll){
        System.out.println("I am using circle to draw " + doll);
    }
}

class square implements PolyInterfaceShape{
    public void draw(){
        System.out.println("This is Square");
    }
    public void draw(String doll){
        System.out.println("I am using square to draw " + doll);
    }
}

class main{
    public static void main(String[] args) {
        PolyInterfaceShape obj1 = new Circle();
        PolyInterfaceShape obj2 = new square();
        obj1.draw();
        obj1.draw("small doll \n");  // Calling the overloaded draw method with an argument (String)
        obj2.draw();
        obj2.draw("small square doll \n");
    }
}

