
public class InstCnt {
	int num = 0;
	static int staticNum = 0;
	//InstCnt�ȿ� ������ ��ü�� ���������� 1����.

	public InstCnt() {
		num++;
		staticNum++;
		System.out.println("num = " + num);
		System.out.println("staticNum = " + staticNum);
	}
	
	
	
}