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
		System.out.println("�̸��� : " + name);
		System.out.println("ID�� : " + id);
		System.out.println("Password�� : " + pwd);
		System.out.println("���̴� : " + age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printName() {
		System.out.println(name);
	}
	
}
