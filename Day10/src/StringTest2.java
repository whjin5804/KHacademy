
public class StringTest2 {
	public static void main(String[] args) {
		//String�� immutable �ν��Ͻ�.
		//immutable > ���� ������ �ʴ�...
		//���� �����Ǵ� �ν��Ͻ��� �ּ�ȭ��
		
		String str1 = "Simple String";
		String str2 = "Simple String";
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		//'==' �����ڴ� ��ü�� �ּҰ��� ��
		if(str1 == str2) {
			System.out.println(1);
		}
		else {
			System.out.println(2);
		}

		if(str2 == str4) {
			System.out.println(3);
		}
		else {
			System.out.println(4);
		}
		

		
		
		
		
		
		
		
		
		
		
	}

}
