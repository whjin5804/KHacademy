
public class Exam03 {
	public static void main(String[] args) {

		int a = 10;

		// a�� 10���� ũ�� '10���� Ů�ϴ�'�� ���

		if (a != 10) {
			System.out.println(a+"���� Ů�ϴ�");
		}
		
		int num3 = 5;
		//num3�� 3���� ũ�� ũ��
		//�׷��� ������ ũ���ʴ� ���
		
		if (num3 > 3) {
			System.out.println("ũ��");
		} else {
			System.out.println("ũ���ʴ�");
		}
		
		int num1 = 10;
		int num2 = 10;
		//num1�� num2���� ũ�� 'num1�� Ů�ϴ�.'
		//num2�� num1���� ũ�� 'num2�� Ů�ϴ�.'
		
		if(num1 > num2) {
			System.out.println("num1�� Ů�ϴ�.");
		}
		else if(num2 > num1) {
			System.out.println("num2�� Ů�ϴ�.");
		}
		else{
			System.out.println("�����ϴ�.");
		}

	}
}
