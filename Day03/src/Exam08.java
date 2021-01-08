import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String stuName;
		int stuKorScore;
		int stuEngScore;
		int stuMathScore;
		
		System.out.print("이름을 입력하세요 : ");
		stuName = sc.nextLine();
		System.out.print("국어 점수를 입력하세요 : ");
		stuKorScore = sc.nextInt();
		System.out.print("영어 점수를 입력하세요 : ");
		stuEngScore = sc.nextInt();
		System.out.print("수학 점수를 입력하세요 : ");
		stuMathScore = sc.nextInt();
		
		int sum = stuEngScore + stuKorScore + stuMathScore;
		double avg = sum / 3;
		
		System.out.println("이름 : " + stuName);
		System.out.println("국어점수 : " + stuKorScore);
		System.out.println("영어점수 : " + stuEngScore);
		System.out.println("수학점수 : " + stuMathScore);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		sc.close();
	}
}
