interface Shape {
    double getArea();
}

class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        return length * width;
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return base * height / 2;
    }
}

public class Error3 {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(5, 4);
        System.out.println("Area of rectangle: " + rectangle.getArea());

        Shape circle = new Circle(3);
        System.out.println("Area of circle: " + circle.getArea());

        Shape triangle = new Triangle(5, 3);
        System.out.println("Area of triangle: " + triangle.area());
    }
}
