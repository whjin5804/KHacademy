import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		try {
			//예외가 발생할 소지가 있는 코드를 작성
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 / num2);
		}catch(Exception e) {
			//예외 발생 시 처리하는 코드를 작성
			e.getMessage();
			e.printStackTrace();
			System.out.println("예외가 발생했습니다.");
		}
		finally { //예외발생 유무를 떠나 무조건 실행
			
		}
//		catch(ArithmeticException e) {
//		//예외 발생 시 처리하는 코드를 작성
//		System.out.println("예외가 발생했습니다.");
//		}
		
		
		System.out.println("프로그램 종료");
	}
	
}
