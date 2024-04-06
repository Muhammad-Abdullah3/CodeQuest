// Interface representing common functionalities of all accounts
interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
// Abstract class showing common functionalities
abstract class AbstractAccount implements Account {
    protected double balance;

    public AbstractAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    @Override
    public double getBalance() 
    {
        return balance;
    }
}

class SavingsAccount extends AbstractAccount 
{
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) 
    {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() 
    {
        balance += balance * interestRate;
    }
    public double getBalance() 
    {
        return balance;
    }
}

class CheckingAccount extends AbstractAccount 
{
    private double overdraftLimit;

    public CheckingAccount(double initialBalance, double draftLimit) {
        super(initialBalance);
        this.overdraftLimit = draftLimit;
}

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
        } else {
            System.out.println("Exceeded overdraft limit");
        }
    }
}
class InvestmentAccount extends AbstractAccount {
    private double interestRate;
    private double investAmount;

    public InvestmentAccount(double initialBalance, double interestRate) 
    {
        super(initialBalance);
        this.interestRate = interestRate;
    }

    public void invest(double amount) 
    {
        investAmount = amount;
    }
    public void addInterest() 
    {
        balance = investAmount +investAmount * interestRate;
    }
    public double getBalance() 
    {
        return balance;
    }
}

// Main class
public class Question1 {
    public static void main(String[] args) {
        SavingsAccount sv = new SavingsAccount(1000, 0.05);
        sv.deposit(500);
        sv.addInterest();
        System.out.println("Savings Account Balance: " + sv.getBalance());

        CheckingAccount cv = new CheckingAccount(2000, 500);
        cv.withdraw(2200);
        System.out.println("Checking Account Balance: " + cv.getBalance());

        InvestmentAccount iv = new InvestmentAccount(5000, 0.1);
        iv.addInterest();
        iv.invest(1000);
        
        System.out.println("Investment Account Balance: " + iv.getBalance());
    }
}
