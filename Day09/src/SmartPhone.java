
public class SmartPhone {
	private String phoneNum;
	private String owner;
	private String brand;
	
	public SmartPhone() {	//�⺻������, default ������
		this.phoneNum = "";
		this.owner = "";
		this.brand = "";
	}
	
	public SmartPhone(String brand) {
//		this.phoneNum = "";
//		this.owner = "";	//�⺻�����ڿ� �ֱ⶧���� ���������ϴ�.
//		this.brand = brand;

		this();	//�⺻ �����ڸ� ȣ���϶�.. ù�����ٿ� ȣ��Ǿ����.
		this.brand = brand;
	}
	
	public SmartPhone(String brand/*LZ*/, String phoneNum/*���*/) {
		this("�Ｚ");
		this.phoneNum = phoneNum;
	}
	
	public void printPhoneInfo() {
		System.out.println("�� ��ȣ�� : " + this.phoneNum);
		System.out.println("�����ڴ� : " + this.owner);
		System.out.println("������� : " + this.brand);
	}
	
	
}   
    