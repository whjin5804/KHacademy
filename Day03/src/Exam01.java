import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		// 연산자
		try {
			int a = 10 % 2; // 모듈러, 나머지 연산자 0
			int b = 10 / 0;
		} catch (Exception e) {
			System.out.println("잘못된 연산입니다.");
		}
		// 같다 ==, 같지않다!=
		// 크거나 같다 >=, 크거나 작다 <=
		// A조건 그리고 B조건 > &&
		// A조건 또는 B조건 > ||
		// 부정 !
		boolean as = !true;
		int c = 10 + 30 * 3 / 3;
		int num1 = 10, num2 = 20;
		num1 = num1 + 1;
		num1 += 1;
		++num1;
		num1++;
		
		num2 = num2 - 1;
		num2 -= 1;
		--num2;
		num2--;
		
		num1 = num1 * 3;
		num1 *= 3;
	}
}
