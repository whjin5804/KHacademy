package Class_RealFinal;

import java.util.Scanner;

public class Reserve {

	public Scanner scanner = new Scanner(System.in);
	public String[] seatS = new String[10];
	public String[] seatA = new String[10];
	public String[] seatB = new String[10];
	
	public void setSeatS(String[] seatS) {
		this.seatS = seatS;
	}
	
	public String[] getSeatS() {
		return seatS;
	}
	
	public void reserAsk() {
		System.out.print("醫뚯꽍援щ텇 S<1>, A<2>, B<3>>>");
		int seatClass = scanner.nextInt();
		scanner.nextLine();
		switch (seatClass) {
		case 1:
			System.out.print("S>> ");
			for (int i = 0; i < seatS.length; i++) {
				seatS[i] = "�뀫�뀫"; 
			}
			for (int i = 0; i < seatS.length; i++) {
				setSeatS(seatS);
				System.out.print(seatS[i]);
			}
			break;
			
		case 2:
			System.out.print("A>> ");
			for (int i = 0; i < seatA.length; i++) {
				seatA[i] = "�뀫�뀫"; 
			}
			for (int i = 0; i < seatA.length; i++) {
				System.out.print(seatA[i]);
			}
			break;
		case 3:
			System.out.print("B>> ");
			for (int i = 0; i < seatB.length; i++) {
				seatB[i] = "�뀫�뀫"; 
			}
			for (int i = 0; i < seatB.length; i++) {
				System.out.print(seatB[i]);
			}
			break;
		default:
			break;
		}
	}
	
	public void reserve() {
		reserAsk();
		System.out.println();
		System.out.print("�씠由�>>");
		String name = scanner.nextLine();
		System.out.print("踰덊샇>>");
		int number = scanner.nextInt();
		seatS[number] = name;	//占싱몌옙占싱띰옙 占쏙옙호 占쏙옙회占쏙옙 占싼깍옙占�
	}
	
	public void getSeat() {
		for (int j = 0; j < seatA.length; j++) {
			seatS[j] = "�뀫";
		}
	}
	
	public void inquiry() {
		
	}
	
	public void cancel() {
		
	}
	
	public int end() {
		return 0;
	}
	
	public void print() {
		System.out.print("�삁�빟<1>, ");
		System.out.print("議고쉶<2>, ");
		System.out.print("痍⑥냼<3>, ");
		System.out.print("�걹�궡湲�<4>>> ");
	}
	
	
	
}
