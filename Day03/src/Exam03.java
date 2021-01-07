
public class Exam03 {
	public static void main(String[] args) {

		int a = 10;

		// a가 10보다 크면 '10보다 큽니다'를 출력

		if (a != 10) {
			System.out.println(a+"보다 큽니다");
		}
		
		int num3 = 5;
		//num3이 3보다 크면 크다
		//그렇지 않으면 크지않다 출력
		
		if (num3 > 3) {
			System.out.println("크다");
		} else {
			System.out.println("크지않다");
		}
		
		int num1 = 10;
		int num2 = 10;
		//num1이 num2보다 크면 'num1이 큽니다.'
		//num2가 num1보다 크면 'num2가 큽니다.'
		
		if(num1 > num2) {
			System.out.println("num1이 큽니다.");
		}
		else if(num2 > num1) {
			System.out.println("num2가 큽니다.");
		}
		else{
			System.out.println("같습니다.");
		}

	}
}
