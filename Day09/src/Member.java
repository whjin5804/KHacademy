
public class Member {

	private String name;
	private String id;
	private String pwd;
	private int age;
	
	//각각의 데이터를 변경하는 메소드 4개
		//setter, getter
		
	//데이터를 사용할수있는 메소드
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//모든 데이터
	public void setMemberInfo(String name, String id, String pwd, int age) {
		this.name = name;
		this.id = id;
		this.pwd = pwd;
		this.age = age;
	}
	
	public void setMemberInfo1(String name, String id, String pwd, int age) {
//		this.name = name;
		setName(name);
//		this.id = id;
		setId(id);
//		this.pwd = pwd;
		setPwd(pwd);
//		this.age = age;
		setAge(age);
	}
}
