package com_Casting;

public class Box {

	public void simpleWrap() {
		System.out.println("simple wrapping");
	}
}

class PaperBox extends Box{
	public void paperWrap() {
		System.out.println("paper wrapping");
	}
}

class GoldPaperBox extends PaperBox{
	public void goldWrap() {
		System.out.println("gold wrapping");
	}
}
