package com_final;

public class A {

	public void aaa() {
		
		System.out.println("aaa");
	}
	
}

class B extends A{

	@Override	//어노테이션을 적음으로써 논리적 오류를 줄인다.
	public void aaa() {
		System.out.println("b");
	}
	
	
}
