package Class_final;

public class Worker {

	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Worker() {
		korScore = 0;
		engScore = 0;
		mathScore = 0;
	}

	public void setSongjuk(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
	
	public int sumScore() {
		return korScore + engScore + mathScore;
	}
	
	public double avgScore() {
		return sumScore() / (double)3;
	}
	
	public void displayStudentInfo() {
		System.out.println("�������� : " + korScore);
		System.out.println("�������� : " + engScore);
		System.out.println("�������� : " + mathScore);
		System.out.println("������ : " + sumScore());
		System.out.println("����� : " + avgScore());
	}
}
