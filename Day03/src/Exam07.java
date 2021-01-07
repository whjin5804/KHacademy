import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		
		System.out.print("이름을 입력 : ");
		name = sc.nextLine();
		System.out.print("나이를 입력 : ");
		age = sc.nextInt();
		System.out.println("OK I got it.\n");
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age);

		sc.close();
	}
}
