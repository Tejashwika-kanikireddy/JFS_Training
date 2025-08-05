// A.java
public class A {
    private A() {
        System.out.println("A constructor");
    }

    // Factory method to create an instance of A (optional)
    public static A getInstance() {
        return new A();
    }

    public void display() {
        System.out.println(" class A");
    }
}
