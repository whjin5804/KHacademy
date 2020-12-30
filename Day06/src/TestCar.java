
public class TestCar {

	public static void main(String[] args) {
		Car car1 = new Car();
		Car car2 = new Car();
		
		car1.setMaker("테슬라");
		car1.setModelName("모델1");
		car1.setCarNumber("7가1234");
		car1.setOwner("진원호");
		car1.setCarPrice(2000);
		car1.printCarInfo();
		
		car2.setCarInfo("현대", "제네시스gv70", "222나1111", "진원호", 1000);
		car2.printCarInfo();
		
	}

}
