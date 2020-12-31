
public class SmartPhone {
	private String phoneNum;
	private String owner;
	private String brand;
	
	public SmartPhone() {	//기본생성자, default 생성자
		this.phoneNum = "";
		this.owner = "";
		this.brand = "";
	}
	
	public SmartPhone(String brand) {
//		this.phoneNum = "";
//		this.owner = "";	//기본생성자에 있기때문에 생략가능하다.
//		this.brand = brand;

		this();	//기본 생성자를 호출하라.. 첫번쨰줄에 호출되어야함.
		this.brand = brand;
	}
	
	public SmartPhone(String brand/*LZ*/, String phoneNum/*비밀*/) {
		this("삼성");
		this.phoneNum = phoneNum;
	}
	
	public void printPhoneInfo() {
		System.out.println("폰 번호는 : " + this.phoneNum);
		System.out.println("소유자는 : " + this.owner);
		System.out.println("제조사는 : " + this.brand);
	}
	
	
}   
    