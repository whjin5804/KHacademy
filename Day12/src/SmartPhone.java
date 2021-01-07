
public class SmartPhone extends MobilePhone{
	String os;
	
	public void playApp() {
		System.out.println("앱을 실행합니다.");
	}
	
	@Override
	public void openKakao() {
		super.openKakao();
		System.out.println("스마트폰으로 켭니다.");
	}
	
	
}
