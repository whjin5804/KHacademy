package com_whjin_print;

public class TestPrint {
	public static void main(String[] args) {
		InkPrinter inkPrinter = new InkPrinter("프린터1", "삼송", "USB");
		RazerPrinter razerPrinter = new RazerPrinter("프린터2", "삼송", "병렬", 20);
		
		inkPrinter.print();
		System.out.println();
		razerPrinter.print();  
				
	}

}
