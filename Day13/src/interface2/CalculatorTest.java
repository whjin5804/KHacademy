package interface2;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calc calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 : ");
		String operator = sc.nextLine();
		
		switch (operator) {
		case "+":
			System.out.println("두 수 " + num1 + "과 " + num2 + "의 덧셈은 " + calc.sum(num1, num2) + "입니다");
			break;
		case "-":
			System.out.println("두 수 " + num1 + "과 " + num2 + "의 뺄셈은 " + calc.substract(num1, num2) + "입니다");
			break;
		case "*":
			System.out.println("두 수 " + num1 + "과 " + num2 + "의 곱셈은 " + calc.multi(num1, num2) + "입니다");
			break;
		case "/":
			System.out.println("두 수 " + num1 + "과 " + num2 + "의 나눗셈은 " + calc.divide(num1, num2) + "입니다");
			break;

		default:
			System.out.println("잘못된 연산자입니다.");
		}

		
		
	}

}
