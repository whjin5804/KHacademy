import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ù ��° �� : ");
		int num1 = sc.nextInt();
		System.out.print("�� ��° �� : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("������ : ");
		String operator = sc.nextLine();
		sc.close();
		
		if(operator.equals("+")) {
		System.out.println(num1 + " " + operator + " " +  + num2 + " = " + (num1+num2));
		}
		else if(operator.equals("-")) {
			System.out.println(num1 + " " + operator + " " +  + num2 + " = " + (num1-num2));
		}
		else if(operator.equals("*")) {
			System.out.println(num1 + " " + operator + " " +  + num2 + " = " + (num1*num2));
		}
		else if(operator.equals("/")) {
			System.out.println(num1 + " " + operator + " " +  + num2 + " = " + (num1/num2));
		}
		else {
			System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�.");
		}
		
		
	}
}
