import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		
		//1
		int ex1 = 0;
		while(ex1 < 5) {
			System.out.print("*");
			ex1++;
		}
		System.out.println("�ѤѤ�2�ѤѤ�");
		for(int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		
		System.out.println("�ѤѤ�3�ѤѤ�");
		int ex3 = 0;
		while (ex3 < 6) {
			System.out.println(ex3);
			ex3++;
		}
		
		System.out.println("�ѤѤ�4�ѤѤ�");
		for (int i = 0; i < 6; i++) {
			System.out.println(i);
		}
		
		System.out.println("�ѤѤ�5�ѤѤ�");
		int ex5 = 2;
		while (ex5 < 11) {
			System.out.println(ex5);
			ex5 = ex5 + 2;
		}
		
		System.out.println("�ѤѤ�6�ѤѤ�");
		for (int i = 2; i < 11; i++) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("�ѤѤ�7�ѤѤ�");
		int ex7 = 10;
		while (ex7 >= 0) {
			System.out.println(ex7);
			ex7--;
		}
		
		System.out.println("�ѤѤ�8�ѤѤ�");
		for(int i = 10; i >= 0 ; i--) {
			System.out.println(i);
		}

		System.out.println("�ѤѤ�9�ѤѤ�");
		int ex9 = 0;
		int sum = 0;
		while (ex9 < 11) {
			sum += ex9;
			ex9++;
		}
		System.out.println(sum);

		
		int sum1 = 0;
		System.out.println("�ѤѤ�10�ѤѤ�");
		for (int i = 0; i < 11; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		
		System.out.println("�ѤѤ�11�ѤѤ�");
		int ex11 = 1;
		int ex =0;
		int sum2 = 0;
		while (ex11 < 101) {
			if(ex11 % 5 == 0) {
				sum2++;
			}
			ex11++;
		}
		System.out.println(sum2);
	
		System.out.println("�ѤѤ�12�ѤѤ�");
		int j = 0;
		for (int i = 1; i < 101; i++) {
			if(i % 5 == 0) {
				j++;
			}
		}
		System.out.println(j);
		
		System.out.println("�ѤѤ�13�ѤѤ�");
		Scanner sc = new Scanner(System.in);
		System.out.println("������ ������ �Է��ϼ���");
		int ex13 = sc.nextInt();
		int ex131 = 1;
		int sum4 = 0;
		while (ex131 <= ex13) {
			if(ex131 % 2 == 0) {
				sum4 ++;
			}
			ex131++;
		}
		System.out.println("¦���� ������ : " + sum4);
		
		
		System.out.println("�ѤѤ�14�ѤѤ�");
		System.out.println("������ ������ �Է��ϼ���");
		int ex14 = sc.nextInt();
		int k = 1;
		int sum5 = 0;
		for (int i = 1; i <= ex14; i++) {
			if(i % 2 == 0) {
				sum5 += k;
			}
		}
		System.out.println(sum5);
		
		
		
		
		
		
		
		
		
		
	}
}
