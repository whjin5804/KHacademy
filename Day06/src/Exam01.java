
public class Exam01 {
	public static void main(String[] args) {
		int a = 0; //��������
		System.out.println("���α׷� ����");
		System.out.println("���� ��...");
		System.out.println("���α׷� ����");
		run();
		greet("20");
		greet("30");
	}
	
	public static void run() {
		System.out.println("���� ��...1");
	}
	
	public static void greet(String age) {
		System.out.println("�ȳ��ϼ���");
		System.out.println("�� ���̴� " + age + "���Դϴ�.");
	}
	
}
