
public class Car {
	private String maker;
	private String modelName;
	private String carNumer;
	private String owner;
	private int carPrice;
	//각각의 속성을 변경하는 메소드
	
	public void setMaker(String m) {
		maker = m;
	}
	public void setModelName(String name) {
		modelName = name;
	}
	public void setCarNumber(String number) {
		carNumer = number;
	}
	public void setOwner(String owner1) {
		owner = owner1;
	}
	public void setCarPrice(int carPrice1) {
		carPrice = carPrice1;
	}
	//모든 속성을 변경하는 메소드
	public void setCarInfo(String m, String name, String number, String own, int price) {
		maker = m;
		modelName = name;
		carNumer = number;
		owner = own;
		carPrice = price;
		
	}

	//모든 정보를 출력하는메소드
	public void printCarInfo() {
		System.out.println("제조사 : " + maker);
		System.out.println("차량이름 : " + modelName);
		System.out.println("차량번호 : " + carNumer);
		System.out.println("가격 : " + carPrice);
		System.out.println("소유주 : " + owner);
	}
}
