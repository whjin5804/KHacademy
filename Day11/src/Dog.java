
public class Dog extends Animal{
	
	public Dog() {
		System.out.println("Dog�� �θ��ϴ�.");
	}
	
	@Override
	public void sound() {
		super.sound();
		System.out.println("�۸�");
	}

	public void sound2() {
		System.out.println();
		super.sound();
		this.sound();
	}
}
