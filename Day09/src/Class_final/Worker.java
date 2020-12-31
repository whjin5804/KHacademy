package Class_final;

public class Worker {

	private int korScore;
	private int engScore;
	private int mathScore;
	private int sum;
	private int avg;

	public void setSongjuk(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public void displayStudentInfo() {
		System.out.println("국어점수 : " + korScore);
		System.out.println("영어점수 : " + engScore);
		System.out.println("수학점수 : " + mathScore);
	}
}
