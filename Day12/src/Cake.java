
public class Cake {
	String cream;
	
	public void eat() {
		System.out.println("����ũ�� �Դ´�");
	}
	
	public void aaa() {
		
	}
	
	
	
}

class cheeseCake extends Cake{
	String cheese;
	
	@Override
	public void eat() {
		System.out.println("ġ������ũ�� �Դ´�.");
	}
	
	public void bbb() {
		
	}
}

class StrawberryCheeseCake extends cheeseCake{
	String strawberry;
	
	@Override
	public void eat() {
		System.out.println("����ġ������ũ�� �Դ´�.");
	}
}

