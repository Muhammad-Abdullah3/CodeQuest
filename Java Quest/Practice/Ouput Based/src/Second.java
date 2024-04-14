class Product {
    void sell() {
        System.out.println("Product is sold");
    }
}
class Electronic extends Product {
    void sell() {
        System.out.println("Electronic product is sold");
    }
}
class Clothing extends Product {
    void sell() {
        System.out.println("Clothing product is sold");
    }
}
public class Second {
    public static void main(String[] args) {
        Clothing clothing = new Clothing();
        Product product = (Product) clothing;
        product.sell();
    }
}
