package test13;

import java.util.Scanner;

public class Product {
	static Scanner sc;
	//식별자, 상품설명, 생산자, 가격정보
	private int id;
	private String info;
	private String maker;
	private int price;
	
	static {			//static 초기화구문
		sc = new Scanner(System.in);
	}
	
	public void setInfo(int id) {
		this.id = id;
		System.out.print("상품 설명>>");
		info = sc.nextLine();
		System.out.print("생산자>>");
		maker = sc.nextLine();
		System.out.print("가격>>");
		price = sc.nextInt();
		Product.sc.nextLine();
	}
	
	public void printInfo() {
		System.out.println("상품ID>>" + id);
		System.out.println("상품 설명>>" + info);
		System.out.println("생산자>>" + maker);
		System.out.println("가격>>" + price);
	}
	
	
}
