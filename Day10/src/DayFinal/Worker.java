package DayFinal;

public class Worker {
	private PersonInfo personInfo;
	private WorkInfo workInfo;
	
	public void setInfo(String name, String addr, int age) {
		personInfo.setInfo(name, addr, age);
	}
	
	
	public void setWorkInfo(String company, String department, int salary) {
		workInfo.setWorkInfo(company, department, salary);
	}
	
	public void siplayWorker() {
		System.out.println("�̸� : " + personInfo.getName());
		System.out.println("���� : " + personInfo.getAge());
		System.out.println("�ּ� : " + personInfo.getAddr());
		System.out.println("ȸ��� : " + workInfo.getCompany());
		System.out.println("�μ� : " + workInfo.getDepartment());
		System.out.println("�޿� : " + workInfo.getSalary());
	}
	
	
}
