package Class_final;

public class Student {

	private String companyName;
	private String workPlace;
	private int price;
	
	public void setWorkInfo(String companyNmae, String workPlace, int price) {
		this.companyName = companyNmae;
		this.workPlace = workPlace;
		this.price = price;
	}
	
	public void displayWoker() {
		System.out.println("ȸ��� : " + companyName);
		System.out.println("�μ� : " + workPlace);
		System.out.println("�޿� : " + price);
	}
	
	
}
