
public class TestCake3 {
	public static void main(String[] args) {
		
		//�� ���� ������ ����ȯ����(cake, object)
		cheeseCake cc = new cheeseCake();
		cc.bbb();
		
		Cake c = (Cake)cc;
//		c.bbb(); ������ ����
		
		if(cc instanceof StrawberryCheeseCake) {
		StrawberryCheeseCake scc = (StrawberryCheeseCake)cc; //��Ÿ�ӿ���
		}
		
		
		
		
	}
}
