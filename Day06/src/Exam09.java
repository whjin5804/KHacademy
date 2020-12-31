
public class Exam09 {

	public static void switching(int[] a, int[] b) {
		int[] temp = a;
		a = b;
		b = temp;
	}
			
	public static void main(String[] args) {
		int[] a = {20};
		int[] b = {30};
		
		switching(a, b);
		
		for (int i = 0; i < 1; i++) {
			System.out.println(a[i]);
			System.out.println(b[i]);
		}
		
		
	}
}
