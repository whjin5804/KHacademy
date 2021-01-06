package com_whjin_print;

public class RazerPrinter extends Printer{
	private int tonerRest;
	
	
	public RazerPrinter(String modelName, String brand, String interfaceVar, int tonerRest) {
		super(modelName, brand, interfaceVar);
		this.tonerRest = tonerRest;
	}

	@Override
	public void print() {
		super.print();
		System.out.println("≈‰≥ ¿‹∑Æ : " + tonerRest);
	}
	
}
