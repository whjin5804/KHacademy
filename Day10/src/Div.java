
public class Div {
	private int a;
	private int b;
	
	//피연산자를 객체 내에 설정한다.
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	//목적에 맞는 연산을 실행하고, 결과를 리턴
	public int calculate() {
		return a / b;
	}
}
