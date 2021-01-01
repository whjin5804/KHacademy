package Class_final;

public class Worker {
	WorkInfo workInfo = new WorkInfo();
	
	public void setWorkInfo(String companyNmae, String workPlace, int price) {
		workInfo.setWorkInfo(companyNmae, workPlace, price);
	}
	
	public void displayWoker() {
		workInfo.displayWoker();
	}
	
	
	PersonInfo personInfo = new PersonInfo();
	public void setInfo(String name, String address, int age){
		personInfo.setInfo(name, address, age);
	}
	
	
}
