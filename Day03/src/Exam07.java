import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = "";
		int age = 0;
		
		System.out.print("�̸��� �Է� : ");
		name = sc.nextLine();
		System.out.print("���̸� �Է� : ");
		age = sc.nextInt();
		System.out.println("OK I got it.\n");
		System.out.println("�̸��� " + name);
		System.out.println("���̴� " + age);

		sc.close();
	}
}
