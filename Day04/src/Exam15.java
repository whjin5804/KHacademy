import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		
		System.out.println("�ѤѤ�15�ѤѤ�");
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� ���ڸ� �Է��Ͻÿ�");
		int random = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(random + " * " + i + " = " + (random*i));
		}
		System.out.println("�ѤѤ�16�ѤѤ�");
		System.out.println("����� ����� ������ �Է��Ͻÿ�");
		int num1 = sc.nextInt();
		for (int i = 1; i < num1+1; i++) {
			if(num1 % i == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("�ѤѤ�17�ѤѤ�");
		String tellmeYesNo;
		
		do {
			System.out.print("ù ��° �� : ");
			int firstNum = sc.nextInt();
			System.out.print("�� ��° �� : ");
			int secondNum = sc.nextInt();
			sc.nextLine();
			System.out.print("������ : ");
			String operator = sc.nextLine();
			if (operator.equals("+")) {
				System.out.println(firstNum + operator + secondNum + " = " + (firstNum + secondNum));
			}
			else if (operator.equals("-")) {
				System.out.println(firstNum + operator + secondNum + " = " + (firstNum - secondNum));
			}
			else if (operator.equals("*")) {
				System.out.println(firstNum + operator + secondNum + " = " + (firstNum * secondNum));
			}
			else if (operator.equals("/")) {
				System.out.println(firstNum + operator + secondNum + " = " + (firstNum / secondNum));
			}
			System.out.print("����Ͻðڽ��ϱ�?(y,n)");
			tellmeYesNo = sc.nextLine();
			if(tellmeYesNo.equals("n"))
				System.out.println("���α׷��� �����մϴ�.");
		}while(tellmeYesNo.equals("y"));
			
		
		
	}
}
