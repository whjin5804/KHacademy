
public class Exam04 {
	//�Ű������� ���� �� ������ ���� ���
	public static void printSum1(int a, int b) {
		System.out.println(a+b);
	}
	
	//�Ű������� ���� �� ������ ���� ��ȯ.
	public static int getSum(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		printSum1(3, 4);
		int a = getSum(9, 1);
		System.out.println(a);
		
		System.out.println(getSum(10, 20));
	}
}
