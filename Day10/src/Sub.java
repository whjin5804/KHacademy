
public class Sub {
	private int a;
	private int b;
	
	//�ǿ����ڸ� ��ü ���� �����Ѵ�.
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//������ �´� ������ �����ϰ�, ����� ����
	public int calculate() {
		return a - b;
	}
}
