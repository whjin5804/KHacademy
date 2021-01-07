import java.util.Scanner;
import java.util.function.IntPredicate;

public class Exam07 {
	public static void main(String[] args) {
		//5
		int[] arr = new int[5];
		System.out.println(arr[1]);
		System.out.println(arr[3]);
		
		//6
		int[] arr1 = new int[10];
		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		
		//7
		int[] arr2 = new int[10];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = 3;
			System.out.println(arr2[i]);
		}
		
		//8
		int[] arr3 = new int[10];
		for (int i = 0; i < arr3.length; i++) {
			arr3[i] = i+1;
			System.out.println(arr3[i]);
		}
		
		//9
		int[] arr4 = {1, 5, 7};
		int sum = 0;
		for (int i = 0; i < arr4.length; i++) {
			sum += arr4[i];
		}
		System.out.println(sum);
		
		//10
		Scanner sc = new Scanner(System.in);
		int[] arr5 = new int[5];
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = sc.nextInt();
		}
		
		//11
		int[] arr6 = {1, 2, 3, 4, 5, 6, 7, 8};
		int cnt = 0;
		for (int i = 0; i < arr6.length; i++) {
			if(arr6[i] % 2 == 0 )
				cnt++;
		}
		System.out.println(cnt);
		
		//12
		int[] score = new int[3];
		int scoreSum = 0;
		double scoreAvg = 0;
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수를 입력하세요.");
			score[i]= sc.nextInt();
			System.out.println("점수는 " + score[i] + "입니다");
			scoreSum += score[i];
		}
		scoreAvg = (double)scoreSum / score.length;
		System.out.println("총점은 : " + scoreSum);
		System.out.print("평균은 : " + scoreAvg);
		
		
		
		
		
		
	}
}
