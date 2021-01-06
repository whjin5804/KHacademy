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
	
	//종이가 남아있으면 리턴 true
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
			System.out.println("모델명 : " + modelName);
			System.out.println("제조사 : " + brand);
			System.out.println("인터페이스 종류 : " + interfaceVar);
			System.out.println("인쇄 매수 : " + COPYNUM);
			System.out.println("인쇄 종이 잔량 " + copyRest);
		}
		else {
			System.out.println("용지를 넣으세요");
		}
		
	}
	
	
}
