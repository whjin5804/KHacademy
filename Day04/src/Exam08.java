import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 수 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 수 : ");
		int num2 = sc.nextInt();
		sc.nextLine();
		System.out.print("연산자 : ");
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
			System.out.println("연산자를 잘못 입력하였습니다.");
		}
		
		
	}
}
