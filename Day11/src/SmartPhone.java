
public class SmartPhone extends Phone{
	String os;

	public SmartPhone(String os, String number) {
		super("010-1323");
		this.os = os;
		System.out.println("스마트폰 생성자 호출");
	}
	
	public void playApp() {
		System.out.println("start app....");
		System.out.println(number);
	}
	
	
	
	
}
