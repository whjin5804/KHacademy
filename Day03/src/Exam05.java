
public class Exam05 {
	public static void main(String[] args) {

		// 1
		int a = 15;
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("3�� 5�� ����Դϴ�.");
		} else if (a % 3 == 0) {
			System.out.println("3�� ����Դϴ�.");
		} else if (a % 5 == 0) {
			System.out.println("5�� ����Դϴ�.");
		}

		System.out.println("�ѤѤѤ�2���ѤѤѤ�");
		// 2
		int bill = 347800;
		int get50000 = bill % 50000;
		int get10000 = get50000 % 10000;
		int get5000 = get10000 % 5000;
		int get1000 = get5000 % 1000;
		int get500 = get1000 % 500;

		System.out.println("5�������� " + (bill / 50000) + "��");
		System.out.println("�������� " + (get50000 / 10000) + "��");
		System.out.println("5õ������ " + (get10000 / 5000) + "��");
		System.out.println("õ������ " + (get5000 / 1000) + "��");
		System.out.println("500������ " + (get1000 / 500) + "��");
		System.out.println("500������ " + (get500 / 100) + "��");

	}
}
