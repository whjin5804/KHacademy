
public class Exam05 {
	public static void main(String[] args) {
		String stuName;
		int korScore;
		int engScore;
		int mathScore;
		
		stuName = "홍길동";
		korScore = 90;
		engScore = 85;
		mathScore = 95;
		
		System.out.println("이름은 " + stuName);
		System.out.println("국어점수는 " + korScore);
		System.out.println("영어점수는 " + engScore);
		System.out.println("수학점수는 " + mathScore);
		
		System.out.println("점수의 총합은 " + (korScore + engScore + mathScore));
		
		double avg = (korScore + engScore + mathScore) / 3.0;
		System.out.println("점수의 평균은 " + avg);
	}
}