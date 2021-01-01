package Class_final;

public class Student {

	private String companyName;
	private String workPlace;
	private int price;
	
	public Student() {
		companyName = "";
		workPlace = "";
		price = 0;
	}
	
	public void setWorkInfo(String companyNmae, String workPlace, int price) {
		this.companyName = companyNmae;
		this.workPlace = workPlace;
		this.price = price;
	}
	
	public void displayWoker() {
		System.out.println("회사명 : " + companyName);
		System.out.println("부서 : " + workPlace);
		System.out.println("급여 : " + price);
	}
	
	
}
