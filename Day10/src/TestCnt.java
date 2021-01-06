
public class TestCnt {
	public static void main(String[] args) {
		InstCnt instCnt1 = new InstCnt();
		InstCnt instCnt2 = new InstCnt();
		InstCnt instCnt3 = new InstCnt();
	
		instCnt1.num = 10;
		System.out.println(instCnt1.num);
		System.out.println(instCnt2.num);
		System.out.println(instCnt3.num);
		
		InstCnt.staticNum = 10;
		System.out.println(InstCnt.staticNum);
		System.out.println(InstCnt.staticNum);
		System.out.println(InstCnt.staticNum);
	}
}
