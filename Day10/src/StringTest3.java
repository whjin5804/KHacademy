public class StringTest3 {
	
	public static void main(String[] args) {
		//String Ŭ�������� �����ϴ� ��ɵ�...
		
		String s1 = "Coffee";
		String s2 = "Bread";
		
		//concat() > ���ڿ��� ����
		String result = s1.concat(s2);
		System.out.println(s1);	//coffee
		System.out.println(result);	//coffeeBread
		System.out.println(s1 + s2); //coffeeBread 
		//���ڿ����� ���ϱ�� �ڵ����� concat()���� �ٲ㼭 �ؼ��̵Ǳ⶧���� �Ȱ���
		
		//���ڿ� �Ϻ� ����	charAt(), substring()
		char result2 = s1.charAt(0);	//charAt �ε�����°�� ���ڸ� �����Ѵ�.
		System.out.println(result2);	
		
		String s3 = "abcdefg";
		String result3 = s3.substring(2);	//���ڿ��� �Ϻθ� ���� 2��° ������ ���ڸ� �޶�!
		System.out.println(s3);
		System.out.println(result3);
		String resultl4 = s3.substring(2, 4);
		System.out.println(resultl4);	//2���� 4��������(4����x)
		
		//split()���ڿ� �ڸ���
		String s4 = "a,b,c,d";
		String[] result5 = s4.split(",");
		for (int i = 0; i < result5.length; i++) {
			System.out.print(result5[i] + " ");	//a b c d
		}
		System.out.println();
		
		String s5 = "JavA";
		s5.toLowerCase();	//java
		s5.toUpperCase();	//JAVA
		s5.equals("Java");	//���ڿ��� ������ �� false
		s5.equalsIgnoreCase("Java");	//��ҹ��ڸ� ���������ʰ� ��
		s5.length();
		
		String a = "a";
		String b = "b";
		String c = "c";
		
		String ab = a.concat(b);
		String abc = ab.concat(c);
		System.out.println(abc);
		System.out.println((a.concat(b).concat(c)));
		
	}
}
