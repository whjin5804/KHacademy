import java.util.Scanner;

//�� ������ �����ϰ� Scanner�� �Է¹ް� �� ���� ū ����� ����ض�

public class Exam16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		int first = 0;	//if�������� �����̱⶧���� false�� �Ǹ� ���� �Ǳ⶧���� 0�� �־��ش�.
		int second = 0;
		int third = 0;
		
		System.out.print("ù��° �� : ");
		num1 = sc.nextInt();
		System.out.print("�ι�° �� : ");
		num2 = sc.nextInt();
		System.out.print("����° �� : ");
		num3 = sc.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			first = num1;
			if(num2 > num3) {
				second = num2;
				third = num3;
			}
			else {
				second = num3;
				third = num2;
			}
		}
		else if(num2 > num1 && num2 > num3) {
			first = num2;
			if(num1 > num3) {
				second = num1;
				third = num3;
			}
			else {
				second = num3;
				third = num1;
			}
		}
		else if(num3 > num1 && num3 > num2) {
			first = num3;
			if(num1 > num2) {
				second = num1;
				third = num2;
			}
			else {
				second = num2;
				third = num1;
			}
		}
		sc.close();
		System.out.println(first + " > " + second + " > " + third);

	}
}
