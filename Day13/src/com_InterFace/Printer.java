package com_InterFace;

//MS���� ����
public interface Printer {
	//�÷�����ϴ� ���
	void printColor();

	//�����±��
	public void print();
}

interface Copiable {
	void copy1();

	void copy2();
}

class SamSungPrinter implements Printer, Copiable{
	
	//���
	public void print() {
		System.out.println("�Ｚ ������ ������");
	}
	
	//�÷�
	public void printColor() {
		System.out.println("�Ｚ ������ �÷����");
	}
	
	public void aaa() {
		
	}

	@Override
	public void copy1() {
		System.out.println("�Ｚ ������ �����մϴ�.");
	}

	@Override
	public void copy2() {
		System.out.println("�Ｚ ������ �����մϴ�.");
	}
}



class LgPrinter implements Printer, Copiable{
	
	//���
	public void print() {
		System.out.println("Lg ������ ������");
	}
	
	//�÷�
	public void printColor() {
		System.out.println("Lg ������ �÷����");
	}

	@Override
	public void copy1() {
		System.out.println("LG 1�� ����");
	}

	@Override
	public void copy2() {
		System.out.println("LG 2�� ����");
		
	}
	
}
	




class LgCopyNotPrint implements Copiable{

	@Override
	public void copy1() {
		System.out.println("���縸 �� �� �ֽ��ϴ�.");
	}

	@Override
	public void copy2() {
		System.out.println("���縸 2�� ����");
	}
	
}