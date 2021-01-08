
public class Exam04 {
	public static void main(String[] args) {
		
		int a1 = 10;
		int b1 = 40;
		int sum = a1+b1;
		if(sum > 50) {
			System.out.println("두 수의 합이 50보다 큽니다.");
		}
		else {
			System.out.println("두 수의 합이 50이하 입니다.");
		}
		
		
		//2
		int num1 = 5;
		if(num1 % 2 == 0) {
			System.out.println("짝수입니다.");
		}
		else{
			System.out.println("홀수입니다.");
		}
		
		
		//3
		int a = 4;
		int b = 5;
		if(a > b) {
			System.out.println("a가 큽니다");
		}
		else if(a < b) {
			System.out.println("b가 큽니다");
		}
		else {
			System.out.println("같습니다.");
		}
		
		
		//4
		int num4 = 33;
		if(num4 % 3 == 0) {
			System.out.println("3의 배수입니다.");
		}
		
		
		//5
		int num5 = 95;
		String grade ="";
		if(num5 > 90 && num5 <= 100) {
			grade = "A학점";
		}
		else if(num5 > 80) {
			grade = "B학점";
		}
		else {
			grade = "C학점";
		}
		System.out.println(grade);
		
		//6
		int num6 = 12;
		if(num6 % 5 == 0) {
			
		}
		else {
			System.out.println("5의 배수를 입력하세요");
		}
		
		
		//7 에러 public class가 존재하지 않음, 존재한다면 B출
		
		
	}
}
