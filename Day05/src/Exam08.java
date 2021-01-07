import java.util.Scanner;

public class Exam08 {
	public static void main(String[] args) {
		
		int cnt = 0;
		for (int i = 1; i <= 100; i++) {
			for (int j = 2; j < i; j++) {
				if(i % j == 0)
					cnt++;
			}
		}
		
		
		//1
		Scanner sc = new Scanner(System.in);
		// 0:국어, 1:영어, 2:수학, 3:총점
		System.out.println("정수를 입력하세요");
		int scores = sc.nextInt();
		int sum = 0;
		int[] arr = new int[scores];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]= i+1;
			sum += arr[i];
		}
		int avg = sum / arr.length;
		System.out.println(avg);
		
		//2
		int[] arr1 = new int[100];
		for (int i = 2; i <= arr1.length; i++) {
			arr1[i]= i;
			for (int j = 2; j < i+1; j++) {
				if(i % j == 0) {
					break;
				}
				else {
					System.out.println(i);
				}
			}
		}
		
		
		
		
		
		
		
	}
}
