
class Acc {
	static String accNumber;//123-11231-123
	static String owner;	//���� ������
	static int balance;	//�ܾ�
	
	//������
	public Acc() {
		accNumber = "����2";
		owner = "����e";
		balance = 1000;
	}
	
	//�ʱ�ȭ �޼ҵ�
	public static void init() {
		accNumber = "����";
		owner = "����";
		balance = 1000;
	}
	
	//�����������
	public static void printAccInfo() {
		System.out.println("���¹�ȣ�� = " + accNumber);
		System.out.println("�����ִ� = " + owner);
		System.out.println("�ܾ��� = " + balance);
	}
	
}
