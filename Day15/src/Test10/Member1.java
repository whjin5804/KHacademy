package Test10;

public class Member1 {
	private String id;
	private String name;
	private String pwd;
	
	public Member1() {}
	
	
	public Member1(String id, String name, String pwd) {
		super();
		this.id = id;
		this.name = name;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "회원이름 : " + name + "\nID : " + id + "\n비밀번호 : " + pwd;
	}
	
	
	
}
