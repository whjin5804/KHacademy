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
		System.out.println("�������� : " + korScore);
		System.out.println("�������� : " + engScore);
		System.out.println("�������� : " + mathScore);
		System.out.println("���� : " + totalScore);
		System.out.println("��� : " + avg);
	}
	
}
