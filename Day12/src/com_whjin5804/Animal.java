package com_whjin5804;

public class Animal {
	
	public void sound() {
		System.out.println("������ ��ϴ�.");
	}
}

class Dog extends Animal{
	
	public void sound() {
		System.out.println("�۸�");
	}
}

class Cat extends Animal{
	
	public void sound() {
		System.out.println("�߿�");
	}
}

class Cow extends Animal{
	
	public void sound() {
		System.out.println("����");
	}
}