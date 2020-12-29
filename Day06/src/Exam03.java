import java.util.Scanner;

public class Exam03 {
	static int abc = 30;
	public static void print5(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void print6(int a, int b, int c) {
		System.out.println(a*b*c);
	}
	
	public static void print7(int a, int b) {
		System.out.println(a / b);
		System.out.println(a % b);
	}
	
	public static void print8(String a, String b) {
		System.out.println(a+b);
	}
	
	public static void print9(String nameString, int age, String adress) {
		System.out.println("이름은 " + nameString + "입니다");
		System.out.println("나이는 " + age + "입니다");
		System.out.println("주소는 " + adress + "입니다");
	}
	
	public static void print11(int num) {
		System.out.println(num);
	}

	public static void print12() {
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		print5(1,2);
		print6(3, 2, 3);
		print7(10,3);
		print8("원호", "존잘..");
		print9("진원호", 20, "울산" );
		System.out.print("입력 : ");
		int num = sc.nextInt();
		print11(num);
		System.out.println(abc);
		
		
	}

}
