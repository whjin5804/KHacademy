
public class AccManage {
	public static void main(String[] args) {
		Acc.init();
		
		Acc a1 = new Acc();	//������
		a1.printAccInfo();
		Acc.printAccInfo();
//		a1.init();
//		a1.printAccInfo();
	}
}
