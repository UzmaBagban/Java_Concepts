package Polymorphism;

public class methodOL2 {

    public static void main(String[] args) {
        sum eg = new sum();
        eg.add();
        eg.add(2,2);
        eg.add(2, 2, 2);

    }

}


class sum{
    
//eg of method overloading
//method with same name but different parameter

    public void add(){
        System.out.println("output " + 0);
    }

    public void add(int a, int b){
        System.out.println("output " + (a+b) );
    }

    public void add(int a, int b, int c){
        System.out.println("output " + (a+b+c) );
    }
}



