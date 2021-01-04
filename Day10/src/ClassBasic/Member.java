package ClassBasic;

public class Member {
	private String name;
	private String id;
	private String pwd;
	
	public Member() {
		name = "";
		id = "";
		pwd = "";
	}
	
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


	public void displayInfo() {
		System.out.println("이름은 : " + name);
		System.out.println("아이디는 : " + id);
		System.out.println("비밀번호는 : " + pwd);
	}
	
	
}
