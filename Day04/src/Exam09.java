import java.util.Scanner;

public class Exam09 {
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
		
		switch(operator) {
		case "+" :
			System.out.println(num1 + " " + operator + " " +  + num2 + " = " + (num1+num2));
			break;
		case "-" :
			System.out.println(num1 + " " + operator + " " +  + num2 + " = " + (num1-num2));
			break;
		case "*" :
			System.out.println(num1 + " " + operator + " " +  + num2 + " = " + (num1*num2));
			break;
		case "/" :
			System.out.println(num1 + " " + operator + " " +  + num2 + " = " + (num1/(double) num2));
			break;
		default :
			System.out.println("�����ڸ� �߸� �Է��Ͽ����ϴ�.");
		}
		
		
		
	}
}
