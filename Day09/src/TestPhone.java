
public class TestPhone {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.printPhoneInfo();
		
		System.out.println();
		SmartPhone smartPhone2 = new SmartPhone("���");
		smartPhone2.printPhoneInfo();
		
		System.out.println();
		SmartPhone smartPhone3 = new SmartPhone("LZ", "���");
		smartPhone3.printPhoneInfo();

		
	}
}
