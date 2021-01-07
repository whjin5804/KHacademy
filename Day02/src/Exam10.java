
class Print{
	
	protected static int num1 = 10;
	public static int num2 = 20;
	private static int num3 = 30;
	static int sum = num1 + num2 + num3;

	public static void print() {
		System.out.println("a = " + num1);
		System.out.println("b = " + num2);
		System.out.println("c = " + num3);
		System.out.println(num1 + " + " + num2 + " + " + num3  + " = " + sum);
	}
	
}
public class Exam10 {
	
	public static void main(String[] args) {
		Print pr = new Print();
		pr.print();
	}
}