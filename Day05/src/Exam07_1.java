import java.util.Scanner;

class ScoreSumAvg{
	
}

public class Exam07_1{
	public static int[] scores = new int[5];
	public static String[] subjects = {"국어", "영어", "수학", "과학"};
	public static double avg = 0.0;

		static void regame(int[] scores, String[] subjects, Scanner sc) {
		for (int i = 0; i < scores.length - 1; i++) {
			System.out.print(subjects[i] + " 점수 : ");
			scores[i] = sc.nextInt();
		}
		
		//총점
		for (int i = 0; i < subjects.length; i++) {
			scores[scores.length - 1] += scores[i];
		}
		
		for (int i = 0; i < subjects.length; i++) {
			System.out.println(subjects[i] + "점수 : " + scores[i]);
		}
	}
	
		static void print() {
		System.out.println("총점 : " + scores[scores.length -1]);
		System.out.println("평균 : " + avg);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		avg = scores[scores.length - 1] / (double)subjects.length;
		
		regame(scores, subjects, sc);
		print();
		sc.close();
	

	}
}