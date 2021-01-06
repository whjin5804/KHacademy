package com_whjin_print;

public class InkPrinter extends Printer{
	private int inkRest;
	
	public InkPrinter(String modelName, String brand, String interfaceVar) {
		super(modelName, brand, interfaceVar);
		this.inkRest = 10;
	}

	
	@Override
	public void print() {
		super.print();
		System.out.println("À×Å© ÀÜ·® : " + inkRest);
	}
	
	
}
