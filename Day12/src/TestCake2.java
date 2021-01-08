//눈마사지기
public class TestCake2 {
	public static void main(String[] args) {
		cheeseCake ck = new cheeseCake();

		
		//두개 중 한개만 만족하면 true	instanceof
		//ck가 objcet 객체이면 true
		//ck가 object 클래스를 상속하는 객체라면 true 실무
		//쉽게이해 : ck가 object클래스로 형변환(강제x) 가능하면 true (double과 int의 관계생각)
		//object o = ck; 가능하면 true = o로 ck를 받을 수 있는가(double로 int를 받을 수 있는가)
		if (ck instanceof Object) {
			System.out.println("object");
		}

		if (ck instanceof Cake) {	//ck가 cake의 객체냐? &&==
			System.out.println("cake");
		}

		if (ck instanceof cheeseCake) {
			System.out.println("cheesecake");
		}

		if (ck instanceof StrawberryCheeseCake) {	//false
			System.out.println("Strawberrycheesecake");
		}
		
		
		
	}
}
