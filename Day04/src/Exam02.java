
public class Exam02 {

	public static void main(String[] args) {
		String str = "나";
		
		//str의 값이 "가"이면 1을 출력
		//str의 값이 "나"이면 2을 출력
		//str의 값이 "다"이면 3을 출력
		
		switch (str) {
		case "가" :
			System.out.println(1);
			break;
		case "나" :
			System.out.println(2);
			break;
		case "다" :
			System.out.println(3);
			break;
		default :
			System.out.println(4);

		}
	}
}
