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
		System.out.println("이름 : " + personInfo.getName());
		System.out.println("나이 : " + personInfo.getAge());
		System.out.println("주소 : " + personInfo.getAddr());
		System.out.println("회사명 : " + workInfo.getCompany());
		System.out.println("부서 : " + workInfo.getDepartment());
		System.out.println("급여 : " + workInfo.getSalary());
	}
	
	
}
