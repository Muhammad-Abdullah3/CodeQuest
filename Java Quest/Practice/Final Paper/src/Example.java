public class Example {
    public static void main(String[] args) {
        try {
            method1();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught in main.");
        } catch (Exception e) {
            System.out.println("Exception caught in main.");
        }
    }
 
    public static void method1() throws Exception {
        try {
            throw new RuntimeException("RuntimeException in method1");
        } finally {
            System.out.println("Finally in method1");
        }
    }
}
