
public class Exam13 {
	public static void main(String[] args) {
//		int num = 1;
//		
//		while (num < 6) {
//			System.out.println(num);
//			num++;
//		}
		
		for(int i = 0; i < 5; i++) {
			System.out.print("*");
		}
		
		//0에서 10까지의 합
		
		int total = 0;
		for(int j = 0; j < 11; j++) {
			total += j;
		}
		System.out.println(total);
		
		
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
		
		int k = 2;
		for (int i = 1; i < 10; i++) {
			System.out.println(k + " * " + i + " = " + (k*i));
		}
		
		
	}
}