
public class TestPhone {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone();
		smartPhone.printPhoneInfo();
		
		System.out.println();
		SmartPhone smartPhone2 = new SmartPhone("»ï¼Û");
		smartPhone2.printPhoneInfo();
		
		System.out.println();
		SmartPhone smartPhone3 = new SmartPhone("LZ", "ºñ¹Ð");
		smartPhone3.printPhoneInfo();

		
	}
}
