
public class TestBank {
	public static void main(String[] args) {
		Bank bank1 = new Bank();
		Bank bank2 = new Bank();
		Bank bank3 = new Bank();
		
		Bank bank4 = new Bank();
		Bank bank5 = new Bank();
//		bank4.setIyul(10.0);
//		bank5.setIyul(10.0);
		Bank.iuyl = 10.0;
		
		bank1.printIyul();
		bank2.printIyul();
		bank3.printIyul();
		bank4.printIyul();
		bank5.printIyul();
		
		
//		bank1.setIyul(10.0);
//		bank2.setIyul(10.0);
//		bank3.setIyul(10.0);
		
	}
}
