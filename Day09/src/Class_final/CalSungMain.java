package Class_final;

import java.util.Scanner;

public class CalSungMain {
	public static void main(String[] args) {
		CalcSungjuk calcSungjuk = new CalcSungjuk();
		Scanner scanner = new Scanner(System.in);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(i+1 + "번째 사람입니다.");
			System.out.println("이름을 입력하세요");
			String name = scanner.nextLine();
			System.out.println("주소를 입력하세요");
			String adress = scanner.nextLine();
			System.out.println("나이를 입력하세요");
			int age = scanner.nextInt();
			System.out.println("국어점수를 입력하세요");
			int korScore = scanner.nextInt();
			System.out.println("영어점수를 입력하세요");
			int engScore = scanner.nextInt();
			System.out.println("수학점수를 입력하세요");
			int mathScore = scanner.nextInt();
			scanner.nextLine();
			calcSungjuk.setInfo(name, adress, age);
			calcSungjuk.setSongjuk(korScore, engScore, mathScore);
			System.out.println();
		}
		
	}
}
