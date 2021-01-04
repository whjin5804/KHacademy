
public class InstCnt {
	int num = 0;
	static int staticNum = 0;
	//InstCnt안에 있지만 객체를 여러개만들어도 1개임.

	public InstCnt() {
		num++;
		staticNum++;
		System.out.println("num = " + num);
		System.out.println("staticNum = " + staticNum);
	}
	
	
	
}