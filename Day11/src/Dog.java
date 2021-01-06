
public class Dog extends Animal{
	
	public Dog() {
		System.out.println("Dog¸¦ ºÎ¸¨´Ï´Ù.");
	}
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("¸Û¸Û");
	}

	public void sound2() {
		System.out.println();
		super.sound();
		this.sound();
	}
}
