import java.io.IOException;

public class Exam01 {
	public static void main(String[] args) throws IOException {
		// ������
		try {
			int a = 10 % 2; // ��ⷯ, ������ ������ 0
			int b = 10 / 0;
		} catch (Exception e) {
			System.out.println("�߸��� �����Դϴ�.");
		}
		// ���� ==, �����ʴ�!=
		// ũ�ų� ���� >=, ũ�ų� �۴� <=
		// A���� �׸��� B���� > &&
		// A���� �Ǵ� B���� > ||
		// ���� !
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
