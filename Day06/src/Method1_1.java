
public class Method1_1 {
	
	//1
	public static void printHello() {
		System.out.println("�ȳ��ϼ��� ");
	}
	
	//2-1
	public static void print1() {
		System.out.print("�ݰ����ϴ� ");
		print2();
	}
	
	//2-2
	public static void print2() {
		System.out.println("����������");
	}
	
	//3
	public static void print3(double num) {
		System.out.println(num);
	}
	
	//4
	public static void print4(String str) {
		System.out.println(str);
	}
	
	public static void main(String[] args) {
		printHello();
		print1();
		print3(58);
		print4("hello~");
	}
	
	
}
