
public class Student {
	private String name;
	private String stuNum;
	private int age;
		
	
	
	public void setName() {
		name = "java";
	}
	
	public void setName(String aaa) {
		name = aaa;
	}
	
	public void setName(int bbb) {
		age = bbb;
	}
	
	public void setName(String aaa, String bbb) {
		name = aaa;
	}
	
	
	public void setStudentInfo(String name, String stuNum, int age) {
		this.name = name;
		this.stuNum = stuNum;
		this.age = age;
	}
	
	
	
	
}
