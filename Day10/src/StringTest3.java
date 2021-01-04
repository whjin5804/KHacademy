public class StringTest3 {
	
	public static void main(String[] args) {
		//String 클래스에서 제공하는 기능들...
		
		String s1 = "Coffee";
		String s2 = "Bread";
		
		//concat() > 문자열을 나열
		String result = s1.concat(s2);
		System.out.println(s1);	//coffee
		System.out.println(result);	//coffeeBread
		System.out.println(s1 + s2); //coffeeBread 
		//문자열들의 더하기는 자동으로 concat()으로 바꿔서 해석이되기때문에 똑같음
		
		//문자열 일부 추출	charAt(), substring()
		char result2 = s1.charAt(0);	//charAt 인덱스번째의 문자를 리턴한다.
		System.out.println(result2);	
		
		String s3 = "abcdefg";
		String result3 = s3.substring(2);	//문자열을 일부를 추출 2번째 이후의 글자를 달라!
		System.out.println(s3);
		System.out.println(result3);
		String resultl4 = s3.substring(2, 4);
		System.out.println(resultl4);	//2부터 4이전까지(4포함x)
		
		//split()문자열 자르기
		String s4 = "a,b,c,d";
		String[] result5 = s4.split(",");
		for (int i = 0; i < result5.length; i++) {
			System.out.print(result5[i] + " ");	//a b c d
		}
		System.out.println();
		
		String s5 = "JavA";
		s5.toLowerCase();	//java
		s5.toUpperCase();	//JAVA
		s5.equals("Java");	//문자열이 같은지 비교 false
		s5.equalsIgnoreCase("Java");	//대소문자를 구분하지않고 비교
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
