package com_InterFace;

public class TestPrinter {
	public static void main(String[] args) {
		SamSungPrinter printer = new SamSungPrinter();
//		printer.print();
//		printer.printColor();
//		printer.copy1();
//		printer.copy2();
//		printer.aaa();
		
		//�������̽��� �����ڰ� ���� ������ ��ü�����Ұ�
//		Printer printer2 = new printer();
		//�������̽��� ������ Ŭ������ �����ڸ� ȣ���Ͽ�
		//��ü ������ ������.
		Printer p1 = new SamSungPrinter();
		Copiable p2 = new SamSungPrinter();
		p1.print();
		p1.printColor();
		
		p2.copy1();
		p2.copy2();
		
	}

}
