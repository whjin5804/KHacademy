package CLASS2;

import java.util.Scanner;

public class CalculResult {
	public static void main(String[] args) {
		Calculator cl = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째  수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째  수 : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 : ");
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
//			System.out.println("연산자를 잘못입력하였습니다.");
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
			System.out.println("연산자를 잘못입력하였습니다.");
		}
		
		
	}
}
