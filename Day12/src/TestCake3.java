
public class TestCake3 {
	public static void main(String[] args) {
		
		//더 작은 범위로 형변환가능(cake, object)
		cheeseCake cc = new cheeseCake();
		cc.bbb();
		
		Cake c = (Cake)cc;
//		c.bbb(); 컴파일 오류
		
		if(cc instanceof StrawberryCheeseCake) {
		StrawberryCheeseCake scc = (StrawberryCheeseCake)cc; //런타임오류
		}
		
		
		
		
	}
}
