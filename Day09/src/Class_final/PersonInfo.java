package Class_final;

public class PersonInfo {
	private String name;
	private String address;
	private int age;
	
	public PersonInfo() {
		name = "";
		address = "";
		age = 0;
	}
	
	public void setInfo(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
		System.out.println("�ּ� : " + address);
	}
	
	
	
	
}
