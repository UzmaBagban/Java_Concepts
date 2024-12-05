package Constructor;
public class definationCons {
    public static void main(String[] args) {
            Car1 defaultObject = new Car1();
            defaultObject.display();

            Car1 paramatrizedCons = new Car1("paramatrizedConstructor","paramatrized yellow",2);
            paramatrizedCons.display();
            // copy constructor
            // paramatrizedCons is passed in this object
            Car1 copyObject = new Car1(paramatrizedCons);
            copyObject.display();

            Car1 thisObject = new Car1();
            defaultObject.display();


        }

    }
class Car1 { // Class names should start with uppercase
String name;
String color; // Variable names should be lowercase
int seats; // Variable names should be lowercase
int wheels;
// Constructor should be defined inside the class
public Car1() {
    name = "default Car";
    color = "default yellow"; // Fixed spelling of "default"
    seats = 4;
}


public Car1(String name1, String color1, int seats1){
    this.name = name1;
    this.color =color1;
    this.seats = seats1;
}


public Car1(Car1 other){
    this.name =other.name;
    this.color = other.color;
    this.seats = other.seats;
}

 public void display(){
        System.out.println("name is : " + name);
        System.out.println("color is : " + color);
        System.out.println("seats are : " + seats + "\n");
    }
}

