package CLASS2;

import java.util.Scanner;

public class CalculResult {
	public static void main(String[] args) {
		Calculator cl = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��°  �� : ");
		int a = sc.nextInt();
		System.out.print("�� ��°  �� : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.print("������ : ");
		String ab = sc.nextLine();

//		if(ab.equals("+")) {
//			cl.setPlus(a, b, ab);
//			System.out.println(a + ab + b + " = " + cl.getPlus());
//		}
//		
//		else if(ab.equals("-")) {
//			cl.setMinus(a, b, ab);
//			System.out.println(a + ab + b + " = " + cl.getMinus());
//		}
//		
//		else if(ab.equals("*")) {
//			cl.setMulti(a, b, ab);
//			System.out.println(a + ab + b + " = " + cl.getMulti());
//		}
//		
//		else if(ab.equals("/")) {
//			cl.setDiv(a, b, ab);
//			System.out.println(a + ab + b + " = " + cl.getDiv());
//		}
//		else {
//			System.out.println("�����ڸ� �߸��Է��Ͽ����ϴ�.");
//		}
		
		switch (ab) {
		case "+" :
			System.out.println(a + ab + b + " = " + cl.getPlus());
			break;
		case "-" :
			System.out.println(a + ab + b + " = " + cl.getMinus());
			break;
		case "*" :
			System.out.println(a + ab + b + " = " + cl.getMulti());
			break;
		case "/" :
			cl.setDiv(a, b, ab);
			System.out.println(a + ab + b + " = " + cl.getDiv());
			break;
		default:
			System.out.println("�����ڸ� �߸��Է��Ͽ����ϴ�.");
		}
		
		
	}
}
