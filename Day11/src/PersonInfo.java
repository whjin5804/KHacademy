
public class PersonInfo extends Base {
	private double tall;
	private double weight;
	private double sight;
	
	public PersonInfo() {
		
	}
	
	public PersonInfo(String name, String jumin) {
		super.setName(name);
		super.setJumin(jumin);
	}
	
	public void setPerson() {
		this.tall = 180.0;
		this.weight = 70.5;
		this.sight = 1.5;
	}
	
	public void disPerson() {
		setPerson();
		System.out.println("키 = " + tall);
		System.out.println("몸무게 = " + weight);
		System.out.println("시력 = " + sight);
	}
	
	public void disp() {	//두번쨰 호출
		System.out.println(getName() + "님~!");
		System.out.println();
		SungJuk.printSumAvg();
		System.out.println();
		disPerson();
	}
	
	
	
}
