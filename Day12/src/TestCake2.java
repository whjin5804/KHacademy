//����������
public class TestCake2 {
	public static void main(String[] args) {
		cheeseCake ck = new cheeseCake();

		
		//�ΰ� �� �Ѱ��� �����ϸ� true	instanceof
		//ck�� objcet ��ü�̸� true
		//ck�� object Ŭ������ ����ϴ� ��ü��� true �ǹ�
		//�������� : ck�� objectŬ������ ����ȯ(����x) �����ϸ� true (double�� int�� �������)
		//object o = ck; �����ϸ� true = o�� ck�� ���� �� �ִ°�(double�� int�� ���� �� �ִ°�)
		if (ck instanceof Object) {
			System.out.println("object");
		}

		if (ck instanceof Cake) {	//ck�� cake�� ��ü��? &&==
			System.out.println("cake");
		}

		if (ck instanceof cheeseCake) {
			System.out.println("cheesecake");
		}

		if (ck instanceof StrawberryCheeseCake) {	//false
			System.out.println("Strawberrycheesecake");
		}
		
		
		
	}
}
