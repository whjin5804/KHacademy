
public class Exam06 {

	public static void divNum(int a, int b) {
		if(b == 0) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return ;
		}
		System.out.println("������ ����� " + a / b);
	}
	
	public static void main(String[] args) {
		divNum(4, 2);//2
		divNum(6, 2);//3
		divNum(9, 0);//
	}
	
}
