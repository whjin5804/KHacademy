package com_Casting;
public class TestBox {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		wrapBox(box3);
	}

	public static void wrapBox(Box a) {
	
		//두개 중 한개만 만족하면 true	instanceof
		//ck가 GoldPaperBox 객체이면 true
		//ck가 GoldPaperBox 클래스를 상속하는 객체라면 true 실무
		//쉽게이해 : ck가 object클래스로 형변환(강제x) 가능하면 true (double과 int의 관계생각)
		//object o = ck; 가능하면 true = o로 ck를 받을 수 있는가(double로 int를 받을 수 있는가)
		if (a instanceof GoldPaperBox) {
			((GoldPaperBox)a).goldWrap();	//Box를 받은 줄 알았기때문에, 형변환필요
		}
		else if (a instanceof PaperBox) {
			((PaperBox)a).paperWrap();
		}
		else {
			a.simpleWrap();
		}
		
	}
	
	
}
