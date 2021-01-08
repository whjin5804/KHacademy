
public class Exam13 {
	public static void main(String[] args) {
		int a = 3;
		int b;
		
		//a가 3보다 크거나 같으면 b는 1
		//그렇지 않으면 b는 2
		if(a >= 3) {
			b = 1;
		}
		else {
			b = 2;
		}
		
		//삼항 연산자
		b = a >= 3 ? 1 : 2;
	}
}
