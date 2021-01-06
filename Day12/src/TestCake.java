/*
 * 다형성과 override 결합
 */
public class TestCake {
	public static void main(String[] args) {
		Cake ck = new StrawberryCheeseCake();
		
		Cake c = new Cake();
		c.eat();
		
		cheeseCake c1 = new cheeseCake();
		c1.eat();	//오버라이딩된다.
		
		//다형성+오버라이딩
		cheeseCake ck1 = new StrawberryCheeseCake();
		ck1.eat();	//딸기치즈케이크를 먹는다
		
	}
}
