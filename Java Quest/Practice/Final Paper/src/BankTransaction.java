public class BankTransaction {
    public void processTransaction(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("Invalid transaction amount");
            }
            System.out.println("Processing transaction with amount: " + amount);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }
    }
 
    public static void main(String[] args) {
        BankTransaction transaction = new BankTransaction();
        transaction.processTransaction(100.50);
        transaction.processTransaction(-50.75);
    }
}
