package Class_RealFinal;


public class ReserveMain {
	public static void main(String[] args) {
		Reserve reserve = new Reserve();
		reserve.print();
		int choice = reserve.scanner.nextInt();
		reserve.scanner.nextLine();
		switch (choice) {
		case 1 :
			reserve.reserve();
			break;
		case 2 :
			reserve.inquiry();
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
		

		
		
		
		
		
		
		
	}
}
