
public class Cake {
	String cream;
	
	public void eat() {
		System.out.println("����ũ�� �Դ´�");
	}
}

class cheeseCake extends Cake{
	String cheese;
	
	@Override
	public void eat() {
		System.out.println("ġ������ũ�� �Դ´�.");
	}
}

class StrawberryCheeseCake extends cheeseCake{
	String strawberry;
	
	@Override
	public void eat() {
		System.out.println("����ġ������ũ�� �Դ´�.");
	}
}