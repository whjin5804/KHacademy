package DayFinal;

public class WorkInfo {

	private String company;
	private String department;
	private int salary;
	
	public void setWorkInfo(String company, String department, int salary) {
		this.company = company;
		this.department = department;
		this.salary = salary;
	}
	
	public void displayInfo(){
		System.out.println("ȸ��� : " + company);
		System.out.println("�μ� : " + department);
		System.out.println("�޿� : " + salary);
	}

}
