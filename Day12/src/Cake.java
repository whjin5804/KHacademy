
public class Cake {
	String cream;
	
	public void eat() {
		System.out.println("케이크를 먹는다");
	}
}

class cheeseCake extends Cake{
	String cheese;
	
	@Override
	public void eat() {
		System.out.println("치즈케이크를 먹는다.");
	}
}

class StrawberryCheeseCake extends cheeseCake{
	String strawberry;
	
	@Override
	public void eat() {
		System.out.println("딸기치즈케이크를 먹는다.");
	}
}