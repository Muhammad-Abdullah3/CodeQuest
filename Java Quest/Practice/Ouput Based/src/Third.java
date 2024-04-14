class Customer {
    void purchase() {
        System.out.println("Customer makes a purchase");
    }
}

class VIPCustomer extends Customer {
    void purchase() {
        System.out.println("VIP Customer makes a purchase");
    }
}

class RegularCustomer extends Customer {
    void purchase() {
        super.purchase();
        System.out.println("Regular Customer makes a purchase");
    }
}

public class Third {
    public static void main(String[] args) {
        Customer customer = new RegularCustomer();
        RegularCustomer regularCustomer = (RegularCustomer) customer;
        regularCustomer.purchase();
    }
}
