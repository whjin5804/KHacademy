package DayFinal;

public class PersonInfo {
	
	private String name;
	private String addr;
	private int age;
	
	public void setInfo(String name, String addr, int age) {
		this.name = name;
		this.addr = addr;
		this.age = age;
	}

	public void displayInfo() {
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + addr);
	}

}
