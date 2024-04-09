class Animal {
    String name;
    Animal(String name) {
        name = name;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

class Horse extends Animal {
    String breed;

    Horse(String name, String breed) {
        this.breed = breed;
        super(name);
    }

    void display() {
        System.out.println("Name: " + name +, " Breed: " + breed);
    }
}

class Cat extends Animal {
    String color;

    Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    void display() {
        System.out.println("Name: " + name + ", Color: " + color);
    }
}

public class Error1 {
    public static void main(String[] args) {
        Animal animals = new Animal("Horse");
        Horse aniHor = new Horse("Buddy", "Labrador");
        animals[1] = new Cat("Kitty", "White");

        for (int i = 0; i < animals.length; i++) {
            animals[i].display();
        }
    }
}
