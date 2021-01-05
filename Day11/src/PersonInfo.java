
public class PersonInfo extends Base {
	private double tall;
	private double weight;
	private double sight;
	
	
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
		System.out.println("Å° = " + tall);
		System.out.println("¸ö¹«°Ô = " + weight);
		System.out.println("½Ã·Â = " + sight);
	}
	
	public void disp() {
		System.out.println(getName() + "´Ô~!");
		System.out.println();
		super.printSum();
		System.out.println();
		disPerson();
	}
	
	
	
}
