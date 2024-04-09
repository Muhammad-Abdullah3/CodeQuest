class Fir {
    void display() {
        System.out.println("A");
    }
}

class Sec extends Fir {
    void display() {
        System.out.println("B");
    }
}
public class Output1 {
    public static void main(String[] args) {
        Fir obj1 = new Fir();
        Fir obj2 = new Sec();
        Sec obj3 = new Sec();
        obj1.display();
        obj2.display();
        obj3.display();
    }
}

