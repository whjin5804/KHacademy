package Class_final;

public class Sungjuk {

	private int korScore;
	private int engScore;
	private int mathScore;

	public void setSongjuk(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
		displayStudentInfo();
	}
	
	public int sumScore() {
		return korScore + engScore + mathScore;
	}
	
	public double avgScore() {
		return sumScore() / (double)3;
	}
	
	public void displayStudentInfo() {
		System.out.println("국어점수 : " + korScore);
		System.out.println("영어점수 : " + engScore);
		System.out.println("수학점수 : " + mathScore);
		System.out.println("총점 : " + sumScore());
		System.out.println("평균 : " + avgScore());
	}
}
