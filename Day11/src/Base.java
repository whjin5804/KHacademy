
public class Base {
	private String name;
	private String jumin;
	
	public Base() {
		name = "�����";
		jumin = "111-111";
	}
	public void setName(String name) {
		this.name = "�����";
	}
	public String getName() {
		return name;
	}
	
	public void setJumin(String jumin) {
		this.jumin = "111-111";
	}
	
	public String getJumin() {
		return jumin;
	}
	
	public void printInfo() {
		System.out.println("�̸� = " + name);
		System.out.println("�ֹι�ȣ = " + jumin);
	}


}
