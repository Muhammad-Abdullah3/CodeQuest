import java.util.Scanner;
abstract class BankSystem{
	double balance;
	int pin;
	BankSystem(double balance,int pin){
		this.balance=balance;
		this.pin=pin;
	}
	void newpin(int newpin) {
		
	}
	void withdraw(double amount) {
		
	}
}
class Account extends BankSystem{
    Account(double balance, int pin) {
		super(balance, pin);
	}
	public void changePin(int newPin) {
        this.pin = newPin;
        System.out.println("PIN changed successfully.");
    }
    public void withdraw(double amount) {
        double taxRate = 0.05; // 5% tax rate
        double taxAmount = amount * taxRate;
        double totalWithdrawal = amount + taxAmount;

        if (totalWithdrawal <= balance) {
            balance -= totalWithdrawal;
            System.out.println("Withdrawal of $" + amount + " successful. Tax applied: $" + taxAmount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }
    public void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
public class BankManagementSystem {
	public static void main(String[]args) {
double InitialBalance;
int pin;
Scanner input= new Scanner(System.in);
System.out.println("Enter you initial balance : ");
InitialBalance=input.nextDouble();

System.out.println("Enter you Pin : ");
pin=input.nextInt();

// Create BankAccount object
Account obj = new Account(InitialBalance, pin);

// Menu for user interaction
while (true) {
    System.out.println("\nChoose an option:");
    System.out.println("1. Change PIN");
    System.out.println("2. Withdraw money");
    System.out.println("3. Display balance");
    System.out.println("4. Exit");

    int choice = input.nextInt();

    switch (choice) {
        case 1:
            System.out.print("Enter new PIN: ");
            int newPin = input.nextInt();
            obj.changePin(newPin);
            break;
        case 2:
            System.out.print("Enter amount to withdraw: ");
            double amount = input.nextDouble();
            obj.withdraw(amount);
            break;
        case 3:
            obj.displayBalance();
            break;
        case 4:
            System.out.println("Exiting...");
            System.exit(0);
            break;
        default:
            System.out.println("Invalid choice. Please try again.");
    }
}		
	}

}