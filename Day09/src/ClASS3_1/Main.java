package ClASS3_1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Add add = new Add();
		Sub sub = new Sub();
		Mul mul = new Mul();
		Div div = new Div();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		int a = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int b = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 : ");
		String operator = sc.nextLine();

		if(operator.equals("+")) {
			add.setValue(a, b);
			System.out.println(a+operator+b + " = " + sub.calculate());
		}
		
		else if(operator.equals("-")) {
			sub.setValue(a, b);
			System.out.println(a+operator+b + " = " + sub.calculate());
		}
		
		else if(operator.equals("*")) {
			mul.setValue(a, b);
			System.out.println(a+operator+b + " = " + mul.calculate());
		}
		
		else if(operator.equals("/")) {
			div.setValue(a, b);
			System.out.println(a+operator+b + " = " + div.calculate());
		}
		else {
			System.out.println("잘못된 연산자입니다.");
		}
		
	
	}
}
