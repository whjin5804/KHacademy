
public class Exam02 {
	public static void main(String[] args) {
		int a = 10;
		int b = a;	//b�� a�� ���� ����ȴ�.
		a = 20;
		System.out.println(a);	//20
		System.out.println(b);	//10
		
		
		int[] a1 = {10};
		int[] b1 = a1;	//����Ǵ°��̾ƴ϶� a1�� ����ġ�� ���� �Ȱ��� ����ģ��.
		a1[0] = 20;
		
		System.out.println(a1[0]);	//20
		System.out.println(b1[0]);	//20
		
		String aaa = "A";
		String bbb = aaa;	//�Ϲ��ڷ����� �ƴ����� ����ȴ�.
		aaa = "B";
		
		System.out.println(aaa);	//B
		System.out.println(bbb);	//A
	}
}
