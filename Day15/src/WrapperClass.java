
public class WrapperClass {
	public static void main(String[] args) {
		//�⺻�ڷ����� ��ü�� ��ȯ�����ִ� Ŭ���� - ����Ŭ����
		Integer i = new Integer(3);	//�⺻�ڷ����� Ŭ����ȭ ��Ų ��.
		showData(10);
		//ObjectŬ������ �ޱ����ؼ��� Ŭ�������¿����Ѵ�.
		//������ 10�� �־ �Ǵ������� ����ڽ̵Ǳ⶧���̴�. new Integer(10);
	}

	public static void showData(Object obj) {	//Object obj = new String();
		System.out.println(obj);
	}
	
}
