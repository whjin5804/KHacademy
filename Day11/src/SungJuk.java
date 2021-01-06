
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

	public void disp() {		//첫번째 main호출
		super.printInfo();	//이름, 주민번호
		System.out.println();
		System.out.println("국어 = " + getKorScore());
		System.out.println("영어 = " + getEngScore());
		System.out.println("수학 = " + getmathScore());
		System.out.println();
		personInfo.disPerson();	//키,몸무게,시력
		System.out.println();
		System.out.println("============");
		System.out.println();
	}
	public static void printSumAvg() {
		System.out.println("총점 = " + getSum());
		System.out.println("평균 = " + getAvg());
		System.out.println("학점 = " + getHak() + " 학점");
	}
	
	
}
