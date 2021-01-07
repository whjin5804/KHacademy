
public class SungJuk extends Base{

	private int korScore;
	private int engScore;
	private int mathScore;
	private static int sum;
	private static double avg;
	private static String hak;
	private PersonInfo personInfo;
	
	public SungJuk() {
		personInfo = new PersonInfo();
		korScore = 100;
		engScore = 100;
		mathScore = 100;
		sum = korScore + engScore + mathScore;
		avg = (double)sum / 3;
		hak = "A";
		super.setJumin(getJumin());
		super.setName(getName());
	}
	
	public int getKorScore() {
		return korScore;
	}
	
	public int getEngScore() {
		return engScore;
	}
	
	public int getmathScore() {
		return mathScore;
	}
	
	public String getName() {
		return super.getName();
	}
	
	public String getJumin() {
		return super.getJumin();
	}

	public static int getSum() {
		return sum;
	}

	public static double getAvg() {
		return avg;
	}

	public static String getHak() {
		return hak;
	}

	public void disp() {		//ù��° mainȣ��
		super.printInfo();	//�̸�, �ֹι�ȣ
		System.out.println();
		System.out.println("���� = " + getKorScore());
		System.out.println("���� = " + getEngScore());
		System.out.println("���� = " + getmathScore());
		System.out.println();
		personInfo.disPerson();	//Ű,������,�÷�
		System.out.println();
		System.out.println("============");
		System.out.println();
	}
	public static void printSumAvg() {
		System.out.println("���� = " + getSum());
		System.out.println("��� = " + getAvg());
		System.out.println("���� = " + getHak() + " ����");
	}
	
	
}