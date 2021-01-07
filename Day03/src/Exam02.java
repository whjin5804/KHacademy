
public class Exam02 {
	public static void main(String[] args) {
		int num = 0;

		// 증감연산자 : 값을 1증가
		// 전위형
		++num;
		// 후위형
		num++;
		System.out.println(num);
		num++;
		num++;
		num++;
		System.out.println(num);
		
		int num1 = 5;
		--num1;
		num1--;
		System.out.println(num1+"\n");
		
		int a = 10;
		System.out.println(++a);
		System.out.println(++a);
		System.out.println(a++);
		
		int b = 10;
		int c = ++b;
		System.out.println("b = " + b + " / c = " + c);
		
		int b1 = 10;
		int c1 = b1++;
		System.out.println("b1 = " + b1 + " / c1 = " + c1);
	}
}
