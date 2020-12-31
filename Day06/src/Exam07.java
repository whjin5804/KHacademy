import java.util.Scanner;

public class Exam07 {
	
	public static int run1(int a, int b) {
		return a + b;
	}
	
	public static int run2(int a, int b) {
		return a*b;
	}
	
	public static int run3(int a, int b) {
		int max = 0;
		if(a > b)
			max = a;
		if(b > a)
			max = b;
			return max;
		//return a > b ? a : b;
	}
	
	public static String run4(String a, String b) {
		return a + b;
	}
	
	public static String run5(int num) {
		if(num >= 90) {
			return "A";
		}
		else if(num >= 70) {
			return "B";
		}
		else {
			return "C";
		}
	}

	public static String run6(int num) {
		return Integer.toString(num);	//num + "";도 가능하다.
	}

	public static double run7(double a) {
		return Math.pow(a, 2);
	}
	
	public static double run8(int a, int b, int c) {
		return (a+b+c) / 3; 
	}
	
	public static int run9(int a) {
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			if(i % 2 == 1)
				sum += i;
		}
		return sum;
	}

	public static void print() {
		System.out.println(run3(50,100));
		System.out.println(run4("나는", "천재"));
		System.out.println("5번답은  : " + run5(90));
		System.out.println(run6(4));
		System.out.println(run7(10));
		System.out.println("8번 세 수의 평균은" + run8(10, 15, 20));
		System.out.println("매개변수까지 홀수의 합은 " + run9(10));
	}
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("값을 2개 입력하세욧");
//		int num = sc.nextInt();
//		int num1 = sc.nextInt();
		
//		System.out.println(run2(num, num1));
		print();
		
		
		
		
	}

}
