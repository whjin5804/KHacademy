
public class Car {
	private String maker;
	private String modelName;
	private String carNumer;
	private String owner;
	private int carPrice;
	//������ �Ӽ��� �����ϴ� �޼ҵ�
	
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
	//��� �Ӽ��� �����ϴ� �޼ҵ�
	public void setCarInfo(String m, String name, String number, String own, int price) {
		maker = m;
		modelName = name;
		carNumer = number;
		owner = own;
		carPrice = price;
		
	}

	//��� ������ ����ϴ¸޼ҵ�
	public void printCarInfo() {
		System.out.println("������ : " + maker);
		System.out.println("�����̸� : " + modelName);
		System.out.println("������ȣ : " + carNumer);
		System.out.println("���� : " + carPrice);
		System.out.println("������ : " + owner);
	}
}
