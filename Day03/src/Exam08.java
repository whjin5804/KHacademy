import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stuName;
		int stuKorScore;
		int stuEngScore;
		int stuMathScore;
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		stuName = sc.nextLine();
		System.out.print("���� ������ �Է��ϼ��� : ");
		stuKorScore = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		stuEngScore = sc.nextInt();
		System.out.print("���� ������ �Է��ϼ��� : ");
		stuMathScore = sc.nextInt();
		
		int sum = stuEngScore + stuKorScore + stuMathScore;
		double avg = sum / 3;
		
		System.out.println("�̸� : " + stuName);
		System.out.println("�������� : " + stuKorScore);
		System.out.println("�������� : " + stuEngScore);
		System.out.println("�������� : " + stuMathScore);
		System.out.println("���� : " + sum);
		System.out.println("��� : " + avg);
		sc.close();
	}
}
