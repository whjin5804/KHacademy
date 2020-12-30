
public class Exam02 {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		a = 20;
		System.out.println(a);
		System.out.println(b);
		
		
		int[] a1 = {10};
		int[] b1 = a1;	//복사되는것이아니라 a1이 가르치는 것을 똑같이 가르친다.
		a1[0] = 20;
		
		System.out.println(a1[0]);
		System.out.println(b1[0]);
		
		String aaa = "A";
		String bbb = aaa;
		aaa = "B";
		
		System.out.println(aaa);
		System.out.println(bbb);
	}
}
