package Class_final;

public class PersonInfo {
	private String name;
	private String address;
	private int age;
	
	public void setInfo(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
	
	
	
	
}
