
public class TestCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setMaker("�׽���");
		car1.setModelName("��1");
		car1.setCarNumber("7��1234");
		car1.setOwner("����ȣ");
		car1.setCarPrice(2000);
		car1.printCarInfo();
		
		car2.setCarInfo("����", "���׽ý�gv70", "222��1111", "����ȣ", 1000);
		car2.printCarInfo();
		
	}

}
