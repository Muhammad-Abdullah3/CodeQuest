interface Account{
	public double tax();
	public double transaction();
	public double pinnum();
}
abstract class Bankaccount implements Account{
	//@override
	public double pinnum(double p) {
		double pin=p;
			System.out.println("pin is" +pin);
			return pin;
		}
	//@override
		public double transaction() {
			double transactionAmmount=400;
			
			System.out.println("transiction" +transactionAmmount);
			return transactionAmmount;
		}
		//@override
		public double tax(double t) {
			double taxAmmount=t;
			System.out.println("tax is"+taxAmmount);
			return taxAmmount;
		}
	}
class Savingaccount extends Bankaccount{
	//@override
	public double pinnum(double p) {
		double pin=p;
			System.out.println("pin is" +pin);
			return pin;
		}
	//@override
		public double transaction(double s) {
			double transactionAmmount=s;
			
			System.out.println("Savings account transaction of $" +transactionAmmount);
			return transactionAmmount;
		}
		//@override
		public double tax(double e) {
			double taxAmmount=e;
			System.out.println("tax is"+taxAmmount);
			return taxAmmount;
		}
}
class Checkingaccount extends Savingaccount{
	//@override
	public double pinnum(double p) {
		double pin=p;
			System.out.println("pin is" +pin);
			return pin;
		}
	//@override
		public double transaction(double amm) {
			double transactionAmmount=amm;
			
			System.out.println("Checking account transaction of $" +transactionAmmount);
			return transactionAmmount;
		}
		//@override
		public double tax(double am) {
			double taxAmmount=am;
			System.out.println("tax is"+taxAmmount);
			return taxAmmount;
		}
}
class investmentaccount extends Checkingaccount{
	//@override
	public double pinnum(double v) {
		double pin=v;
		
		
			System.out.println("pin is" +pin);
			return pin;
		}
	//@override
		public double transaction(double x) {
			double transactionAmmount=x;
			System.out.println("Investment account transaction of $" +transactionAmmount);
			return transactionAmmount;
		}
		//@override
		public double tax(double taxAmount) {
			double a=taxAmount;
				System.out.println("tax is"+ a);
			return a;
		}
}
 class bank{
	 public static void main(String[] args) {
		 Savingaccount Savingaccount =new Savingaccount();
		 Savingaccount .pinnum(8786);
		 Savingaccount.transaction(321);
		 Savingaccount.tax(765);
		 Checkingaccount Checkingaccount=new Checkingaccount();
		 Checkingaccount.pinnum(564);
		 Checkingaccount.transaction(543);
		 Checkingaccount.tax(768);
		investmentaccount investment=new investmentaccount();
		investment.pinnum(900);
		investment.transaction(654);
		investment.tax(437);

	 }}
 