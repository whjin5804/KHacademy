
public class Exam06 {

	public static void divNum(int a, int b) {
		if(b == 0) {
			System.out.println("0으로 나눌 수 없습니다.");
			return ;
		}
		System.out.println("나눗셈 결과는 " + a / b);
	}
	
	public static void main(String[] args) {
		divNum(4, 2);//2
		divNum(6, 2);//3
		divNum(9, 0);//
	}
	
}
