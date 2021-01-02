package Class_RealFinal;


public class ReserveMain {
	public static void main(String[] args) {
		Reserve reserve = new Reserve();
		Inquiry inquiry = new Inquiry();
		
		int choice;
		do {
			reserve.print();
			choice = reserve.scanner.nextInt();
			reserve.scanner.nextLine();
			switch (choice) {
			case 1 :
				reserve.reserve();
				break;
			case 2 :
				inquiry.inquiry();
				break;
			case 3 :
				reserve.cancel();
				break;
			case 4 :
				reserve.end();
				break;
			default:
				break;
			}
			
		} while (choice == 1 || choice == 2 || choice == 3);
		

		
		
		
		
	}
}
