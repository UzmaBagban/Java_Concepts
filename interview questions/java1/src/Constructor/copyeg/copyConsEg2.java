package Constructor.copyeg;
public class copyConsEg2 {
        public static void main(String[] args) {
            vehicle V1 = new vehicle();
            System.out.println();
            car V2 = new car(V1);

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

        public void  display(){
            System.out.println("this is display function");
            System.out.println( type);
            System.out.println(wheels + "\n");
        }
    }

    class car{
        String type;
        int wheels;
    //copy constructor
        //car1 is variable name of type vehicle
        car(vehicle car1){
            this.type =car1.type;
            this.wheels = car1.wheels;
            System.out.println("this is copy constructor");
//I have written this print statments because when creating the car object
// is that the car copy constructor does not call the vehicle constructor.
// Instead, it merely copies the values from the vehicle instance to car instance
// so i wrote print statment for car class
            System.out.println("Type of vehicle is: " + car1.type);
            System.out.println("vehicle have: " + car1.wheels + " wheels" );
        }
    }


