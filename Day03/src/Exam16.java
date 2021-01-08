import java.util.Scanner;

//세 정수를 선언하고 Scanner로 입력받고 세 수를 큰 수대로 출력해라

public class Exam16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int first = 0;	//if문에서는 가정이기때문에 false가 되면 빈값이 되기때문에 0을 넣어준다.
		int second = 0;
		int third = 0;
		
		System.out.print("첫번째 수 : ");
		num1 = sc.nextInt();
		System.out.print("두번째 수 : ");
		num2 = sc.nextInt();
		System.out.print("세번째 수 : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			first = num1;
			if(num2 > num3) {
				second = num2;
				third = num3;
			}
			else {
				second = num3;
				third = num2;
			}
		}
		else if(num2 > num1 && num2 > num3) {
			first = num2;
			if(num1 > num3) {
				second = num1;
				third = num3;
			}
			else {
				second = num3;
				third = num1;
			}
		}
		else if(num3 > num1 && num3 > num2) {
			first = num3;
			if(num1 > num2) {
				second = num1;
				third = num2;
			}
			else {
				second = num2;
				third = num1;
			}
		}
		sc.close();
		System.out.println(first + " > " + second + " > " + third);

	}
}
