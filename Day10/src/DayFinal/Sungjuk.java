package DayFinal;

public class Sungjuk {
	private int korScore;
	private int engScore;
	private int mathScore;
	private int totalScore;
	private double avg;
	
	public void setSungjuck(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		this.totalScore = korScore + engScore + mathScore;
		this.avg = totalScore / 3;
	}
	
	public void displayStudentInfo() {
		System.out.println("국어점수 : " + korScore);
		System.out.println("영어점수 : " + engScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("총점 : " + totalScore);
		System.out.println("평균 : " + avg);
	}
	
}
