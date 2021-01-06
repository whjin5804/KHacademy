package com_whjin_print;

public class Printer {
	private String modelName;
	private String brand;
	private String interfaceVar;
	private final int COPYNUM;
	private int copyRest;
	
	public Printer(String modelName, String brand, String interfaceVar) {
		this.modelName = modelName;
		this.brand = brand;
		this.interfaceVar = interfaceVar;
		this.COPYNUM = 1;
		this.copyRest = 100;
	}
	
	//���̰� ���������� ���� true
	public boolean isRemain() {
		copyRest -= COPYNUM;
		if(copyRest > 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void print() {
		
		if(isRemain()) {
			System.out.println("�𵨸� : " + modelName);
			System.out.println("������ : " + brand);
			System.out.println("�������̽� ���� : " + interfaceVar);
			System.out.println("�μ� �ż� : " + COPYNUM);
			System.out.println("�μ� ���� �ܷ� " + copyRest);
		}
		else {
			System.out.println("������ ��������");
		}
		
	}
	
	
}
