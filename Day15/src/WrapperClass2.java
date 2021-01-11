
public class WrapperClass2 {
	public static void main(String[] args) {
		System.out.println("큰수 : " + Integer.max(10,20));
		System.out.println("작은수 : " + Integer.min(10,20));
		System.out.println("합 : " + Integer.sum(10,20));
		
		System.out.println(Integer.max(3, Integer.max(10,8)));
		//숫자를 문자로 변경
		String string = String.valueOf(111);
		//문자를 숫자로 변경
		int num1 = Integer.parseInt("111");
		
		
	}
	
}
