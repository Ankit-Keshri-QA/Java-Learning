package oops;

public class Constructors {

    int x;
    String y;
    boolean z;

    Constructors() {
        System.out.println("This is Constructors with no arguments ");

    }

    Constructors(int x, String y) {
        this(11, "Hitesh", false);
        System.out.println("This is Constructors with 2 arguments ");
        this.x = x;
        this.y = y;
    }

    Constructors(int x, String y, boolean z) {
        System.out.println("This is Constructors with 3 arguments ");
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void view() {
        System.out.println("View:: " + x + " " + y + "  " + z);
    }

    public static void main(String[] args) {
        Constructors c1 = new Constructors();
        Constructors c2 = new Constructors(1, "Deepak");
        Constructors c3 = new Constructors(3, "Sapna", true);
        c1.view();
        c2.view();
        c3.view();

    }
}
