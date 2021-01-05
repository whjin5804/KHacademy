
public class Base {
	private String name;
	private String jumin;
	private SungJuk sungJuk;
	
	public Base() {
		sungJuk = new SungJuk();
	}
	public void setName(String name) {
		this.name = "±è½ÂÇö";
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
		System.out.println("ÀÌ¸§ = " + name);
		System.out.println("ÁÖ¹Î¹øÈ£ = " + jumin);
	}
	
	public void printSum() {
		sungJuk.printSumAvg();
	}

}
