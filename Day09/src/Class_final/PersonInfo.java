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
		printInfo();
	}
	
	public void printInfo() {
		System.out.println("이름은 : " + name);
		System.out.println("주소는 : " + address);
		System.out.println("나이는 : " + age);
	}
	
}
