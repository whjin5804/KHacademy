package com_whjin_print;

public class TestPrint {
	public static void main(String[] args) {
		InkPrinter inkPrinter = new InkPrinter("������1", "���", "USB");
		RazerPrinter razerPrinter = new RazerPrinter("������2", "���", "����", 20);
		
		inkPrinter.print();
		System.out.println();
		razerPrinter.print();  
				
	}

}
