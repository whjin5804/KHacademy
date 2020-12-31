
public class Method1_1 {
	
	//1
	public static void printHello() {
		System.out.println("안녕하세요 ");
	}
	
	//2-1
	public static void print1() {
		System.out.print("반갑습니다 ");
		print2();
	}
	
	//2-2
	public static void print2() {
		System.out.println("오서오세요");
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
