
public class Dog extends Animal{
	
	@Override
	public void sound() {
		System.out.println("�۸�");
		super.sound();
	}

	public void sound2() {
		this.sound();
		super.sound();
	}
}
