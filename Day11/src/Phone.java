
public class Phone {
	protected String number;
	

	public Phone(String number) {
		this.number = number;
		System.out.println("폰 생성자 호출");
	}
	
	public void sendMsg() {
		System.out.println("메시지를 보냅니다");
	}
	
	
}
