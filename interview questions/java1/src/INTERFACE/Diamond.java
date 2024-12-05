package INTERFACE;

public interface Diamond {
    default void show() {
        System.out.println("This is base Diamond");
    }
}

interface B extends Diamond {
    default void show() {
        System.out.println("This is class B");
    }
}

interface C extends Diamond {
    default void show() {
        System.out.println("This is class C");
    }
}
//The class D implements both B and C, which creates ambiguity
// which show() method should be called (from B or C).
class D implements B, C {
    public void show() {
// To resolve this ambiguity,
// D explicitly calls both B.super.show() and C.super.show()
// These refer to invoking the default method of the interfaces B and C
        B.super.show(); // Calls the show() method from interface B
        C.super.show(); // Calls the show() method from interface C
        // Calls the show() method from interface D
    }
}

class DiamondProblemExample {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}
