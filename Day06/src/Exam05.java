import java.util.Scanner;

public class Exam05 {
	static final double PI = 3.14;
	
	public static double makeOne(double a, double PI) {
		return a*a*PI;
	}
	
	public static double getArea(double r) {
		return r*r*PI;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		System.out.println(makeOne(r, PI));
		
		System.out.print("�������� " + r + "��");
		System.out.println("���� ���̴� " + getArea(r));
	}


	//�Ű������� ������(�Ǽ�)�� �����ϸ�
	//�ش� �������� ���� ���� ���̸�
	//�����ϴ� �޼ҵ带 �ۼ�. 
	//PI * ������^2
	
}
