
public class Exam06 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
		
		int c = a;
		a = b;
		b = c;
		
		System.out.println("a= " + a);
		System.out.println("b= " + b);
	}
}