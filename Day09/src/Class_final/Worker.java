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
		System.out.println("�������� : " + korScore);
		System.out.println("�������� : " + engScore);
		System.out.println("�������� : " + mathScore);
	}
}
