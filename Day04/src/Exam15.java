import java.util.Scanner;

public class Exam15 {
	public static void main(String[] args) {
		
		System.out.println("ㅡㅡㅡ15ㅡㅡㅡ");
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단을 받을 숫자를 입력하시오");
		int random = sc.nextInt();
		
		for (int i = 1; i < 10; i++) {
			System.out.println(random + " * " + i + " = " + (random*i));
		}
		System.out.println("ㅡㅡㅡ16ㅡㅡㅡ");
		System.out.println("약수를 출력할 정수를 입력하시오");
		int num1 = sc.nextInt();
		for (int i = 1; i < num1+1; i++) {
			if(num1 % i == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("ㅡㅡㅡ17ㅡㅡㅡ");
		String tellmeYesNo;
		
		do {
			System.out.print("첫 번째 수 : ");
			int firstNum = sc.nextInt();
			System.out.print("두 번째 수 : ");
			int secondNum = sc.nextInt();
			sc.nextLine();
			System.out.print("연산자 : ");
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
			System.out.print("계속하시겠습니까?(y,n)");
			tellmeYesNo = sc.nextLine();
			if(tellmeYesNo.equals("n"))
				System.out.println("프로그램을 종료합니다.");
		}while(tellmeYesNo.equals("y"));
			
		
		
	}
}
