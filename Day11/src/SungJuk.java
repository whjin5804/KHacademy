
public class SungJuk extends Base{

	private int korScore;
	private int engScore;
	private int mathScore;
	private int sum;
	private double avg;
	private String hak;
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

	public int getSum() {
		return sum;
	}

	public double getAvg() {
		return avg;
	}

	public String getHak() {
		return hak;
	}

	public void disp() {
		super.printInfo();
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
	public void printSumAvg() {
		System.out.println("총점 = " + getSum());
		System.out.println("평균 = " + getAvg());
		System.out.println("학점 = " + getHak() + " 학점");
	}
	
	
}
