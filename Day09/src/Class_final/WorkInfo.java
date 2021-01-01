package Class_final;

public class WorkInfo {

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
		System.out.println("회사이름은 : " + companyName);
		System.out.println("회사명은 : " + workPlace);
		System.out.println("가격은 : " + price);
	}
	
	
	
	
}
