package test13;

import java.util.Scanner;

public class Product {
	static Scanner sc;
	//�ĺ���, ��ǰ����, ������, ��������
	private int id;
	private String info;
	private String maker;
	private int price;
	
	static {			//static �ʱ�ȭ����
		sc = new Scanner(System.in);
	}
	
	public void setInfo(int id) {
		this.id = id;
		System.out.print("��ǰ ����>>");
		info = sc.nextLine();
		System.out.print("������>>");
		maker = sc.nextLine();
		System.out.print("����>>");
		price = sc.nextInt();
		Product.sc.nextLine();
	}
	
	public void printInfo() {
		System.out.println("��ǰID>>" + id);
		System.out.println("��ǰ ����>>" + info);
		System.out.println("������>>" + maker);
		System.out.println("����>>" + price);
	}
	
	
}
