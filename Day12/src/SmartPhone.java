
public class SmartPhone extends MobilePhone{
	String os;
	
	public void playApp() {
		System.out.println("���� �����մϴ�.");
	}
	
	@Override
	public void openKakao() {
		super.openKakao();
		System.out.println("����Ʈ������ �մϴ�.");
	}
	
	
}
