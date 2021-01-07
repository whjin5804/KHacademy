package com_Test13;

public class Product {
	private String identify;	//안씀
	private String explainProd;
	private String productor;
	private String price;
	
	public Product() {
		
	}
	
	public Product(String explainProd, String productor, String price) {
		this.explainProd = explainProd;
		this.productor = productor;
		this.price = price;
	}
	
	public void print() {
		System.out.println("상품 설명>>" + explainProd);
		System.out.println("생산자>>" + productor);
		System.out.println("가격>>" + price);
	}
	
	
	
}
