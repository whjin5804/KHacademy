
public class Exam05 {
	public static void main(String[] args) {

		// 1
		int a = 15;
		if (a % 3 == 0 && a % 5 == 0) {
			System.out.println("3과 5의 배수입니다.");
		} else if (a % 3 == 0) {
			System.out.println("3의 배수입니다.");
		} else if (a % 5 == 0) {
			System.out.println("5의 배수입니다.");
		}

		System.out.println("ㅡㅡㅡㅡ2번ㅡㅡㅡㅡ");
		// 2
		int bill = 347800;
		int get50000 = bill % 50000;
		int get10000 = get50000 % 10000;
		int get5000 = get10000 % 5000;
		int get1000 = get5000 % 1000;
		int get500 = get1000 % 500;

		System.out.println("5만원권은 " + (bill / 50000) + "매");
		System.out.println("만원권은 " + (get50000 / 10000) + "매");
		System.out.println("5천원권은 " + (get10000 / 5000) + "매");
		System.out.println("천원권은 " + (get5000 / 1000) + "매");
		System.out.println("500원권은 " + (get1000 / 500) + "개");
		System.out.println("500원권은 " + (get500 / 100) + "개");

	}
}
