package Constructor;
public class singleTon{
    public static void main(String[] args) {
        SingleTonEg2 obj = SingleTonEg2.getInstance();
        SingleTonEg2 obj1 = SingleTonEg2.getInstance();
      //  singleTonEg1 obj2 =  new singleTonEg1();
    }
}
class SingleTonEg2{
    //instance variable of type SingleTonEg2
    private static SingleTonEg2 instance = null;
    //private constructor
    private SingleTonEg2() {
        System.out.println("Inside private constructor of SingleTonEg2");
    }
    //getInstance method of type singleTonEg2
    public static SingleTonEg2 getInstance(){
        if(instance == null){
            instance = new SingleTonEg2();
        }
        return instance;
    }
}
class singleTonEg1 {
    //this class will throw error
    //because its constructor is private
    //during object initialization constructor is called
    //when cons is private so ofcourse object will not be created hence the error
    int no;
    private singleTonEg1() {
        System.out.println("inside the constructor");

    }
}