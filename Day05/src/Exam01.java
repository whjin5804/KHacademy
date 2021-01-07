import java.util.Scanner;

public class Exam01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			if(num == 3)
				break;
		}
		System.out.println("프로그램 종료");
		
		
	}
}