package com_Test13;

public class Product {
	private String identify;	//�Ⱦ�
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
		System.out.println("Product explain>>" + explainProd);
		System.out.println("Productor>>" + productor);
		System.out.println("price>>" + price);
	}
	
	
	
}
