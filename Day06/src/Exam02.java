
public class Exam02 {
	public static void main(String[] args) {
		hello(20, 190.5);
		int a = 30;
		double b = 180.5;
		hello(a, b);
		printSum(10, 20);
		System.out.println(sum1(10, 30));
	}
	
	public static void hello(int age, double height) {
		System.out.println("나이는 " + age);
		System.out.println("키는 " + height);
	}
	
	public static void printSum(int num1, int num2) {
		System.out.println(num1+num2);
	}

	public static int sum1(int num1, int num2) {
		return num1 + num2;
	}
	
	
	
}
