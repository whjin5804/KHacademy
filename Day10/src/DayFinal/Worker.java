package DayFinal;

public class Worker {
	private PersonInfo personInfo;	
	private WorkInfo workInfo;
	
	public Worker() {
		personInfo = new PersonInfo();
		workInfo = new WorkInfo();
	}
	
	
	public void setInfo(String name, String addr, int age) {
		personInfo.setInfo(name, addr, age);
	}
	
	public void setWorkInfo(String company, String department, int salary) {
		workInfo.setWorkInfo(company, department, salary);
	}
	
	public void displayWorker() {
		personInfo.displayInfo();
		workInfo.displayInfo();
	}
	
	
}
