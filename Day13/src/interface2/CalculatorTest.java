package interface2;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calc calc = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("������ : ");
		String operator = sc.nextLine();
		
		switch (operator) {
		case "+":
			System.out.println("�� �� " + num1 + "�� " + num2 + "�� ������ " + calc.sum(num1, num2) + "�Դϴ�");
			break;
		case "-":
			System.out.println("�� �� " + num1 + "�� " + num2 + "�� ������ " + calc.substract(num1, num2) + "�Դϴ�");
			break;
		case "*":
			System.out.println("�� �� " + num1 + "�� " + num2 + "�� ������ " + calc.multi(num1, num2) + "�Դϴ�");
			break;
		case "/":
			System.out.println("�� �� " + num1 + "�� " + num2 + "�� �������� " + calc.divide(num1, num2) + "�Դϴ�");
			break;

		default:
			System.out.println("�߸��� �������Դϴ�.");
		}

		
		
	}

}
