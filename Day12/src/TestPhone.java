
public class TestPhone {
	public static void main(String[] args) {
		MobilePhone mp = new MobilePhone();	
		mp.sendMsg();
		mp.call();
//		mp.playApp(); 에러가난다
		/*모바일폰의 객체를 생성 > 스마트폰의 기능은 사용하지 못한다*/

		
		SmartPhone sp = new SmartPhone();
		sp.sendMsg();
		sp.call();
		sp.playApp();
		/*스마트폰의 객체를 생성 > 모바일폰을 상속받기 때문에 스마트폰 기능도 사용가능하다*/
		
		
		//다형성
		MobilePhone mp1 = new SmartPhone();
		/*할아버지가 모바일폰달라했는데 스마트폰도 모바일폰이니까 스마트폰을 받음*/
		mp1.sendMsg();
		mp1.call();
		mp1.openKakao();
//		mp1.playApp();
		/*할아버지는 스마트폰받았지만 스마트폰기능을 쓸줄모른다.*/
		
		
//		SmartPhone sp1 = new MobilePhone();
		
		
		
		
	}
}
