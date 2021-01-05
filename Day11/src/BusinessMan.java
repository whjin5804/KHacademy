//쓰레기버리기
public class BusinessMan extends Man{
	String company;
	String position;
	
	public BusinessMan(String company, String position) {
		super("hong"); //Man man = new Man(); , 기본생성자이며 이 기본생성자가 숨겨져있다.
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("my company is " + company);
		System.out.println("my position is " + position);
		tellYourName();
		name = "홍길동";
	}
	
}
