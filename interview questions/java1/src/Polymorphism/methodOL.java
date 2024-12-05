package Polymorphism;

public class methodOL {
    public static void main(String[] args) {
        methodOL obj = new methodOL();
        System.out.println(obj.calculateArea(5));
        System.out.println(obj.calculateArea(5,10));

    }
// area of rectangle
    double calculateArea(double length , double width){
        System.out.println("area of rectangle is ");
        return length * width;
    }

//area of circle
    double calculateArea(double radius){
        System.out.println("area of circle is");
        return (Math.PI * radius * radius);
    }


}
