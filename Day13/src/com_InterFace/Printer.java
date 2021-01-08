package com_InterFace;

//MS에서 만듬
public interface Printer {
	//컬러출력하는 기능
	void printColor();

	//흑백출력기능
	public void print();
}

interface Copiable {
	void copy1();

	void copy2();
}

class SamSungPrinter implements Printer, Copiable{
	
	//흑백
	public void print() {
		System.out.println("삼성 프린터 흑백출력");
	}
	
	//컬러
	public void printColor() {
		System.out.println("삼성 프린터 컬러출력");
	}
	
	public void aaa() {
		
	}

	@Override
	public void copy1() {
		System.out.println("삼성 한장을 복사합니다.");
	}

	@Override
	public void copy2() {
		System.out.println("삼성 두장을 복사합니다.");
	}
}



class LgPrinter implements Printer, Copiable{
	
	//흑백
	public void print() {
		System.out.println("Lg 프린터 흑백출력");
	}
	
	//컬러
	public void printColor() {
		System.out.println("Lg 프린터 컬러출력");
	}

	@Override
	public void copy1() {
		System.out.println("LG 1장 복사");
	}

	@Override
	public void copy2() {
		System.out.println("LG 2장 복사");
		
	}
	
}
	




class LgCopyNotPrint implements Copiable{

	@Override
	public void copy1() {
		System.out.println("복사만 할 수 있습니다.");
	}

	@Override
	public void copy2() {
		System.out.println("복사만 2장 가능");
	}
	
}