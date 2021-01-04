
public class StringTest2 {
	public static void main(String[] args) {
		//String은 immutable 인스턴스.
		//immutable > 값이 변하지 않는...
		//따라서 생성되는 인스턴스를 최소화함
		
		String str1 = "Simple String";
		String str2 = "Simple String";
		String str3 = new String("Simple String");
		String str4 = new String("Simple String");
		
		//'==' 연산자는 객체의 주소값을 비교
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
