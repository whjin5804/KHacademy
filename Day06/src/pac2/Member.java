package pac2;

public class Member {

	private String name;
	private String id;
	private String pwd;
	private int age;
	
	public Member() {
		name = "";
		id = "";
		pwd = "";
		age = 0;
	}
	
	public void printMember() {
		System.out.println("이름은 : " + name);
		System.out.println("ID는 : " + id);
		System.out.println("Password는 : " + pwd);
		System.out.println("나이는 : " + age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
	}
	
}
