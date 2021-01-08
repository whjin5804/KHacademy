import java.util.Scanner;

public class Exam14 {
	public static void main(String[] args) {
		
		//1
		int ex1 = 0;
		while(ex1 < 5) {
			System.out.print("*");
			ex1++;
		}
		System.out.println("ㅡㅡㅡ2ㅡㅡㅡ");
		for(int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		
		System.out.println("ㅡㅡㅡ3ㅡㅡㅡ");
		int ex3 = 0;
		while (ex3 < 6) {
			System.out.println(ex3);
			ex3++;
		}
		
		System.out.println("ㅡㅡㅡ4ㅡㅡㅡ");
		for (int i = 0; i < 6; i++) {
			System.out.println(i);
		}
		
		System.out.println("ㅡㅡㅡ5ㅡㅡㅡ");
		int ex5 = 2;
		while (ex5 < 11) {
			System.out.println(ex5);
			ex5 = ex5 + 2;
		}
		
		System.out.println("ㅡㅡㅡ6ㅡㅡㅡ");
		for (int i = 2; i < 11; i++) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("ㅡㅡㅡ7ㅡㅡㅡ");
		int ex7 = 10;
		while (ex7 >= 0) {
			System.out.println(ex7);
			ex7--;
		}
		
		System.out.println("ㅡㅡㅡ8ㅡㅡㅡ");
		for(int i = 10; i >= 0 ; i--) {
			System.out.println(i);
		}

		System.out.println("ㅡㅡㅡ9ㅡㅡㅡ");
		int ex9 = 0;
		int sum = 0;
		while (ex9 < 11) {
			sum += ex9;
			ex9++;
		}
		System.out.println(sum);

		
		int sum1 = 0;
		System.out.println("ㅡㅡㅡ10ㅡㅡㅡ");
		for (int i = 0; i < 11; i++) {
			sum1 += i;
		}
		System.out.println(sum1);
		
		
		System.out.println("ㅡㅡㅡ11ㅡㅡㅡ");
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
	
		System.out.println("ㅡㅡㅡ12ㅡㅡㅡ");
		int j = 0;
		for (int i = 1; i < 101; i++) {
			if(i % 5 == 0) {
				j++;
			}
		}
		System.out.println(j);
		
		System.out.println("ㅡㅡㅡ13ㅡㅡㅡ");
		Scanner sc = new Scanner(System.in);
		System.out.println("임의의 정수를 입력하세요");
		int ex13 = sc.nextInt();
		int ex131 = 1;
		int sum4 = 0;
		while (ex131 <= ex13) {
			if(ex131 % 2 == 0) {
				sum4 ++;
			}
			ex131++;
		}
		System.out.println("짝수의 갯수는 : " + sum4);
		
		
		System.out.println("ㅡㅡㅡ14ㅡㅡㅡ");
		System.out.println("임의의 정수를 입력하세요");
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
