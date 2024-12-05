package Constructor;
public class constructorChaining1 {

    // constructor chaining is of 2 types
    // Intra-Class (within the same class)
    // --> In this one constructor calls another constructor within the same class using this() keyword
    public static void main(String[] args) {
        fruits thisObject = new fruits();
        thisObject.display();
    }
}
class fruits{
    String name;
    String Color;
    int dozens;

    fruits(){
        //calling paramatrrized constructor using this() constructor chaining
        //calling one constructor with another constructor
        this("apple","red",1);
    }

    fruits(String name1, String color, int dozens1){
       this.name = name1;
       this.Color = color;
       this.dozens = dozens1;
   }

   public void display(){
       System.out.println("name : " + name);
       System.out.println("Color : " + Color);
       System.out.println("Dozens : " + dozens);
   }
}
