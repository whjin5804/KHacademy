
public class Exam02 {
	public static void main(String[] args) {
		int a = 10;
		int b = a;
		a = 20;
		System.out.println(a);
		System.out.println(b);
		
		
		int[] a1 = {10};
		int[] b1 = a1;	//����Ǵ°��̾ƴ϶� a1�� ����ġ�� ���� �Ȱ��� ����ģ��.
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
