/*
 * �������� override ����
 */
public class TestCake {
	public static void main(String[] args) {
		Cake ck = new StrawberryCheeseCake();
		
		Cake c = new Cake();
		c.eat();
		
		cheeseCake c1 = new cheeseCake();
		c1.eat();	//�������̵��ȴ�.
		
		//������+�������̵�
		cheeseCake ck1 = new StrawberryCheeseCake();
		ck1.eat();	//����ġ������ũ�� �Դ´�
		
	}
}
