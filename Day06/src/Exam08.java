import java.awt.Event;
import java.util.Iterator;
import java.util.Scanner;

public class Exam08 {
	
	public static void run1(int num) {
		System.out.println(num);
	}
	
	public static void run2(int a) {
		for (int i = 1; i < 10; i++) {
			System.out.println(a + " * " + i + " = " + a*i);
		}
	}
	
	public static void run3(int a) {
		for (int i = 1; i < 101; i++) {
			if(i % a == 0)
				System.out.print(i + " ");
		}
	}
	
	public static int run4() {
		int a =  (int) (Math.random()*49+1);
		return a;
	}
	
	public static boolean run4_1(int a) {
		if(a % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void run5(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static int run6(int[] a) {
		int max = 0;
		for (int i = 0; i < a.length; i++) {
			if(max < a[i])
				max = a[i];
		}
		return max;
	}
	
	public static String run7(String[] a) {
		String sum= "";
		for (int i = 0; i < a.length; i++) {
			sum += a[i] + " ";
		}
		return sum; 
	}

	public static int[] run8(int[] a, int[] b) {
		int[] aPlusB = new int[a.length + b.length];
		for (int i = 0; i < aPlusB.length; i++) {
			if(i < a.length) {
				aPlusB[i] = a[i];
			}
			else {
				aPlusB[i] = b[i-a.length]; 
			}
		}
			return aPlusB;
	}
	
	public static int[] run9(int[] num) {
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0 )
				cnt++;
		}
		
		int[] result = new int[cnt];
		int index = 0;
		for (int i = 0; i < num.length; i++) {
			if(num[i] % 2 == 0 ) {
				result[index++] = num[i];
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		int num = sc.nextInt();
//		run1(num);
		
		run2(3);
		run3(10);
		System.out.println();
		System.out.println(run4());
		System.out.println(run4_1(10));
		
		int[] ab = {10, 21, 81, 31, 90, 83, 70};
		run5(ab);
		System.out.println(run6(ab));
		
		String[] abc = {"hello","wonho"};
		System.out.println(run7(abc));
		
		
		int[] a = {1,2,3,0};
		int[] b = {4,5,6,7,8};
		int[] temp;
		temp = run8(a, b);
		for (int i = 0; i < a.length+b.length; i++) {
			System.out.println(temp[i]);
		}
		int[] result = run9(b);
		
		for(int e : result) {
			System.out.print(e + " ");
		}
		
		
		
	}

}
