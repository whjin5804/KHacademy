import java.util.Scanner;

public class Exam05 {
	static final double PI = 3.14;
	
	public static double makeOne(double a, double PI) {
		return a*a*PI;
	}
	
	public static double getArea(double r) {
		return r*r*PI;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.println(makeOne(r, PI));
		
		System.out.print("반지름이 " + r + "인");
		System.out.println("원의 넓이는 " + getArea(r));
	}


	//매개변수로 반지름(실수)을 전달하면
	//해당 반지름을 갖는 원의 넓이를
	//리턴하는 메소드를 작성. 
	//PI * 반지름^2
	
}
