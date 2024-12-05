package Constructor;
public class constructorChaining2{
public static void main(String[] args) {
    vehicle V1 = new vehicle();
    System.out.println();
    truck v3 = new truck("tata5");
}
}
class vehicle{
String type;
int wheels;

vehicle(){
    this("unknown", 0);
}
vehicle(String type1, int wheels1){
    this.type = type1;
    this.wheels = wheels1;
    System.out.println("Type of vehicle is: " + type1);
    System.out.println("vehicle have: " + wheels1 + " wheels" );
}

}
class truck extends vehicle{
String model;
truck(){
//using super keyword for constructor chaining
    super("truck",4);

}
truck(String model){
//calling default constructor first
//which it inherited from vehicle class using super
    this();
//adding model parameter of its own
    this.model = model;
    System.out.println("model of the truck : " + model);
}
}
