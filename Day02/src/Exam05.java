
public class Exam05 {
	public static void main(String[] args) {
		String stuName;
		int korScore;
		int engScore;
		int mathScore;
		
		stuName = "ȫ�浿";
		korScore = 90;
		engScore = 85;
		mathScore = 95;
		
		System.out.println("�̸��� " + stuName);
		System.out.println("���������� " + korScore);
		System.out.println("���������� " + engScore);
		System.out.println("���������� " + mathScore);
		
		System.out.println("������ ������ " + (korScore + engScore + mathScore));
		
		double avg = (korScore + engScore + mathScore) / 3.0;
		System.out.println("������ ����� " + avg);
	}
}