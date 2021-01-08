package com_InterFace;

public class TestPrinter {
	public static void main(String[] args) {
		SamSungPrinter printer = new SamSungPrinter();
//		printer.print();
//		printer.printColor();
//		printer.copy1();
//		printer.copy2();
//		printer.aaa();
		
		//인터페이스는 생성자가 없기 떄문에 객체생성불가
//		Printer printer2 = new printer();
		//인터페이스를 구현한 클래스의 생성자를 호출하여
		//객체 생성이 가능함.
		Printer p1 = new SamSungPrinter();
		Copiable p2 = new SamSungPrinter();
		p1.print();
		p1.printColor();
		
		p2.copy1();
		p2.copy2();
		
	}

}
