package Class_RealFinal;

import java.util.Scanner;

public class Reserve {

	public Scanner scanner = new Scanner(System.in);
	private String[] seatS = new String[10];
	private String[] seatA = new String[10];
	private String[] seatB = new String[10];
	
	public void reserAsk() {
		System.out.print("좌석구분 S<1>, A<2>, B<3>>>");
		int seatClass = scanner.nextInt();
		scanner.nextLine();
		switch (seatClass) {
		case 1:
			System.out.print("S>> ");
			for (int i = 0; i < seatS.length; i++) {
				seatS[i] = "ㅡ"; 
			}
			for (int i = 0; i < seatS.length; i++) {
				System.out.print(seatS[i]);
			}
			break;
			
		case 2:
			System.out.print("A>> ");
			for (int i = 0; i < seatA.length; i++) {
				seatA[i] = "ㅡ"; 
			}
			for (int i = 0; i < seatA.length; i++) {
				System.out.print(seatA[i]);
			}
			break;
		case 3:
			System.out.print("B>> ");
			for (int i = 0; i < seatB.length; i++) {
				seatB[i] = "ㅡ"; 
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
		System.out.print("이름>>");
		String name = scanner.nextLine();
		System.out.print("번호>>");
		int number = scanner.nextInt();
		seatS[number] = name;	//이름이랑 번호 조회로 넘기기
	}

	
	public void inquiry() {
		
	}
	
	public void cancel() {
		
	}
	
	public int end() {
		return 0;
	}
	
	public void print() {
		System.out.print("예약<1>, ");
		System.out.print("조회<2>, ");
		System.out.print("취소<3>, ");
		System.out.print("끝내기<4>>> ");
	}
	
	
	
}
