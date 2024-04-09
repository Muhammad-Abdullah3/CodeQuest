abstract class Shape {
    abstract void draw();
    void draw(int n) {
        System.out.println("Drawing " + n + " shapes");
    }
}

class Pentagon extends Shape {
    void draw() {
        System.out.println("Drawing a pentagon");
    }
}

public class Output3 {
    public static void main(String[] args) {
        Shape shape = new Pentagon();
        shape.draw();
        shape.draw(6);
    }
}
