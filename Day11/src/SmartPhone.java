
public class SmartPhone extends Phone{
	String os;

	public SmartPhone(String os, String number) {
		super("010-1323");
		this.os = os;
		System.out.println("����Ʈ�� ������ ȣ��");
	}
	
	public void playApp() {
		System.out.println("start app....");
		System.out.println(number);
	}
	
	
	
	
}
