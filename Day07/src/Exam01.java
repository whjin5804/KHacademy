
public class Exam01 {
	
	public static boolean isEven(int a) {
		return a % 2 == 0 ? true : false;
	}
	
	public static void main(String[] args) {
		boolean isEven = isEven(32);
		System.out.println(isEven);
//		System.out.println(isEven(2147483647));
	}
}
