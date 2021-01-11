
public class WrapperClass {
	public static void main(String[] args) {
		//기본자료형을 객체로 변환시켜주는 클래스 - 래퍼클래스
		Integer i = new Integer(3);	//기본자료형을 클래스화 시킨 것.
		showData(10);
		//Object클래스로 받기위해서는 클래스형태여야한다.
		//하지만 10을 넣어도 되는이유는 오토박싱되기때문이다. new Integer(10);
	}

	public static void showData(Object obj) {	//Object obj = new String();
		System.out.println(obj);
	}
	
}
