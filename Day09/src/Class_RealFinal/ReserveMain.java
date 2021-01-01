package Class_RealFinal;

import java.util.Scanner;

public class ReserveMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Reserve reserve = new Reserve();
		reserve.print();
		int choice = scanner.nextInt();
		scanner.nextLine();
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
		default:
			break;
		}
		
		int seatClass = scanner.nextInt();
		switch (seatClass) {
		case 1:
			System.out.println("S>> ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			break;
		case 2:
			System.out.println("A>> ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			break;
		case 3:
			System.out.println("B>> ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			break;
		default:
			break;
		}
		
		
		
		
		
		
		
	}
}
