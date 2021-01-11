
public class Student1 {
	private String stuName;
	private int korScore;
	private int engScore;
	private int sum;
	
	public Student1(String stuName, int korScore, int engScore) {
		super();
		this.stuName = stuName;
		this.korScore = korScore;
		this.engScore = engScore;
		this.sum = korScore + engScore;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public int getKorScore() {
		return korScore;
	}
	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}
	public int getEngScore() {
		return engScore;
	}
	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	
	
	
	@Override
	public String toString() {
		return "Student1 [stuName=" + stuName + ", korScore=" + korScore + ", engScore=" + engScore + ", sum=" + sum
				+ "]";
	}
	
}
