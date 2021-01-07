
public class Exam02 {
	public static void main(String[] args) {
		int a = 10;
		int b = a;	//b에 a의 값이 복사된다.
		a = 20;
		System.out.println(a);	//20
		System.out.println(b);	//10
		
		
		int[] a1 = {10};
		int[] b1 = a1;	//복사되는것이아니라 a1이 가르치는 것을 똑같이 가르친다.
		a1[0] = 20;
		
		System.out.println(a1[0]);	//20
		System.out.println(b1[0]);	//20
		
		String aaa = "A";
		String bbb = aaa;	//일반자료형은 아니지만 복사된다.
		aaa = "B";
		
		System.out.println(aaa);	//B
		System.out.println(bbb);	//A
	}
}
