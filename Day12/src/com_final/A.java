package com_final;

public class A {

	public void aaa() {
		
		System.out.println("aaa");
	}
	
}

class B extends A{

	@Override	//������̼��� �������ν� ���� ������ ���δ�.
	public void aaa() {
		System.out.println("b");
	}
	
	
}
