
public class BoxingUnBoxing {
	public static void main(String[] args) {
		//박싱(기본자료형>객체화)
		Integer iObj = new Integer(10);
		Double dObj = new Double(10.1);
		
		//언박싱(객체>기본자료형)
		int num1 = iObj.intValue();
		double num2 = dObj.doubleValue();
		
		// iObj값을 증가
		iObj = new Integer(iObj.intValue() + 5);
		dObj = new Double(dObj.doubleValue() + 1);
		
		Integer iObj2 = 10;	//오토박싱
		//Integer iObj2 = new Integer(10); >자동으로 컴파일러가 이렇게 해석
		int num3 = iObj;	//오토언박싱
		// int num3 = iObjc.intValue(); > 자동으로 해석해줌.
		iObj = iObj + 5;
		//iObj = new Integer(iObj.intValue() + 5); > 자동해석
	}

}
