class One {
    int x;

    One() {
        this(5);
        System.out.print("D Constructor");
    }

    One(int x) {
        this.x = x;
        System.out.println("P Constructor");
    }
}

class Two extends One {
    Two() {
        super(5);
        System.out.println("D2 constructor");
    }
}

public class Output2 {
    public static void main(String[] args) {
        Sec obj = new Sec();
    }
}
