interface Account{
	public double tax();
	public double transaction();
	public double pinnum();
}
abstract class Bankaccount implements Account{
	//@override
	public double pinnum() {
		double pin=1;
		
		
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
		public double tax() {
			double taxAmmount=500;
			System.out.println("tax is"+taxAmmount);
			return taxAmmount;
		}
	}
class Savingaccount extends Bankaccount{
	//@override
	public double pinnum() {
		double pin=1;
		
		
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
		public double tax() {
			double taxAmmount=500;
			System.out.println("tax is"+taxAmmount);
			return taxAmmount;
		}
}
class Checkingaccount extends Savingaccount{
	//@override
	public double pinnum() {
		double pin=1;
		
		
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
		public double tax() {
			double taxAmmount=500;
			System.out.println("tax is"+taxAmmount);
			return taxAmmount;
		}
}
class investmentaccount extends Checkingaccount{
	//@override
	public double pinnum() {
		double pin=1;
		
		
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
		public double tax() {
			double taxAmmount=500;
			System.out.println("tax is"+taxAmmount);
			return taxAmmount;
		}
}

 class Main{
	 public static void main(String[] args) {
		 Savingaccount s =new Savingaccount();
		 s.tax();
		 s.pinnum();
		 s.transaction();
		 Checkingaccount c=new Checkingaccount();
		 c.tax();
		 c.pinnum();
		 c.transaction();
		investmentaccount i=new investmentaccount();
		 i.tax();
		 i.pinnum();
		 i.transaction();
		 
		 
	 }
 }
