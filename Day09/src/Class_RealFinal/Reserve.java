package Class_RealFinal;

import java.util.Scanner;

public class Reserve {

	public Scanner scanner = new Scanner(System.in);
	private String[] seatS = new String[10];
	private String[] seatA = new String[10];
	private String[] seatB = new String[10];
	
	public void reserAsk() {
		System.out.print("�¼����� S<1>, A<2>, B<3>>>");
		int seatClass = scanner.nextInt();
		scanner.nextLine();
		switch (seatClass) {
		case 1:
			System.out.print("S>> ");
			for (int i = 0; i < seatS.length; i++) {
				seatS[i] = "��"; 
			}
			for (int i = 0; i < seatS.length; i++) {
				System.out.print(seatS[i]);
			}
			break;
			
		case 2:
			System.out.print("A>> ");
			for (int i = 0; i < seatA.length; i++) {
				seatA[i] = "��"; 
			}
			for (int i = 0; i < seatA.length; i++) {
				System.out.print(seatA[i]);
			}
			break;
		case 3:
			System.out.print("B>> ");
			for (int i = 0; i < seatB.length; i++) {
				seatB[i] = "��"; 
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
		System.out.print("�̸�>>");
		String name = scanner.nextLine();
		System.out.print("��ȣ>>");
		int number = scanner.nextInt();
		seatS[number] = name;	//�̸��̶� ��ȣ ��ȸ�� �ѱ��
	}

	
	public void inquiry() {
		
	}
	
	public void cancel() {
		
	}
	
	public int end() {
		return 0;
	}
	
	public void print() {
		System.out.print("����<1>, ");
		System.out.print("��ȸ<2>, ");
		System.out.print("���<3>, ");
		System.out.print("������<4>>> ");
	}
	
	
	
}
