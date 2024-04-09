class A {
    int x;

    A() {
        this(5);
        System.out.println("A default constructor");
    }

    A(int x) {
        this.x = x;
        System.out.println("A parameterized constructor");
    }
}

class B extends A {
    B() {
        System.out.println("B default constructor");
    }
}

public class Output2 {
    public static void main(String[] args) {
        B obj = new B();
    }
}
