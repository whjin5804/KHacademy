//�����������
public class BusinessMan extends Man{
	String company;
	String position;
	
	public BusinessMan(String company, String position) {
		super("hong"); //Man man = new Man(); , �⺻�������̸� �� �⺻�����ڰ� �������ִ�.
		this.company = company;
		this.position = position;
	}
	
	public void tellYourInfo() {
		System.out.println("my company is " + company);
		System.out.println("my position is " + position);
		tellYourName();
		name = "ȫ�浿";
	}
	
}
