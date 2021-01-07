package com_Casting;
public class TestBox {

	public static void main(String[] args) {
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		wrapBox(box3);
	}

	public static void wrapBox(Box a) {
	
		//�ΰ� �� �Ѱ��� �����ϸ� true	instanceof
		//ck�� GoldPaperBox ��ü�̸� true
		//ck�� GoldPaperBox Ŭ������ ����ϴ� ��ü��� true �ǹ�
		//�������� : ck�� objectŬ������ ����ȯ(����x) �����ϸ� true (double�� int�� �������)
		//object o = ck; �����ϸ� true = o�� ck�� ���� �� �ִ°�(double�� int�� ���� �� �ִ°�)
		if (a instanceof GoldPaperBox) {
			((GoldPaperBox)a).goldWrap();	//Box�� ���� �� �˾ұ⶧����, ����ȯ�ʿ�
		}
		else if (a instanceof PaperBox) {
			((PaperBox)a).paperWrap();
		}
		else {
			a.simpleWrap();
		}
		
	}
	
	
}
