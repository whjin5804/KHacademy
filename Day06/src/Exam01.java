
public class Exam01 {
	public static void main(String[] args) {
		int a = 0; //지역변수
		System.out.println("프로그램 시작");
		System.out.println("실행 중...");
		System.out.println("프로그램 종료");
		run();
		greet("20");
		greet("30");
	}
	
	public static void run() {
		System.out.println("실행 중...1");
	}
	
	public static void greet(String age) {
		System.out.println("안녕하세요");
		System.out.println("제 나이는 " + age + "살입니다.");
	}
	
}
