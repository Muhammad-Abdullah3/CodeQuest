class EidUlFitr {
    void observe() {
        System.out.println("Eid Ul Fitr is observed");
    }
}
class Celebration extends EidUlFitr {
    void observe() {
        System.out.println("Eid Ul Fitr is observed with festivities");
    }
}
class Tradition extends EidUlFitr {
    void observe() {
        System.out.println("Eid Ul Fitr is observed with cultural practices");
    }
}
public class First {
    public static void main(String[] args) {
        Tradition tradition = new Tradition();
        EidUlFitr eid = (EidUlFitr) tradition;
        eid.observe();
    }
}
