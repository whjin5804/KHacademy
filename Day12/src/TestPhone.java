
public class TestPhone {
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone();	
		mp.sendMsg();
		mp.call();
//		mp.playApp(); ����������
		/*��������� ��ü�� ���� > ����Ʈ���� ����� ������� ���Ѵ�*/

		
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.call();
		sp.playApp();
		/*����Ʈ���� ��ü�� ���� > ��������� ��ӹޱ� ������ ����Ʈ�� ��ɵ� ��밡���ϴ�*/
		
		
		//������
		MobilePhone mp1 = new SmartPhone();
		/*�Ҿƹ����� ��������޶��ߴµ� ����Ʈ���� ��������̴ϱ� ����Ʈ���� ����*/
		mp1.sendMsg();
		mp1.call();
//		mp1.playApp();
		/*�Ҿƹ����� ����Ʈ���޾����� ����Ʈ������� ���ٸ𸥴�.*/
		
		
//		SmartPhone sp1 = new MobilePhone();
		
		
		
		
	}
}
