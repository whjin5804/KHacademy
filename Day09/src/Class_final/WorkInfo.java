package Class_final;

public class WorkInfo {

	private String companyName;
	private String workPlace;
	private int price;
	
	public WorkInfo() {
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
		System.out.println("�쉶�궗�씠由꾩� : " + companyName);
		System.out.println("�쉶�궗紐낆� : " + workPlace);
		System.out.println("媛�寃⑹� : " + price);
	}
	
	
	
	
}
