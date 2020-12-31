package CLASS2;

public class Person {

	private String name;
	private String address;
	private int age;
	
	public Person() {
		this.name = "";
		this.address = "";
		this.age = 0;
	}
	
	public void setPersonInfo(String name, String address, int age) {
		this.name = name;
		this.address = address;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAdrress(String address) {
		this.address = address;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAddress() {
		return address;
	}
	
	public int getAge() {
		return age;
	}
	
	public void printPersonInfo() {
		System.out.println("이름은 : " + name);
		System.out.println("주소는 : " + address);
		System.out.println("나이는 : " + age);
	}
	
	
}
