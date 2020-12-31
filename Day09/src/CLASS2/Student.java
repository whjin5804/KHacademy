package CLASS2;

public class Student {

	private String name;
	private String address;
	private String stuNum;
	private String phoneNum;
	private int age;
	
	public Student() {
		name = "";
		address = "";
		stuNum = "";
		phoneNum = "";
		age = 0;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getStuNum() {
		return stuNum;
	}

	public void setStuNum(String stuNum) {
		this.stuNum = stuNum;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printStuInfo() {
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		System.out.println("주소는 : " + address);
		System.out.println("학번은 : " + stuNum);
		System.out.println("연락처는 : " + phoneNum);
	}

	
}
