
public class Exam04 {
	//매개변수로 받은 두 정수의 합을 출력
	public static void printSum1(int a, int b) {
		System.out.println(a+b);
	}
	
	//매개변수로 받은 두 정수의 합을 반환.
	public static int getSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		printSum1(3, 4);
		int a = getSum(9, 1);
		System.out.println(a);
		
		System.out.println(getSum(10, 20));
	}
}
