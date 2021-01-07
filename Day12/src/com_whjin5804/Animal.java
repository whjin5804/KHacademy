package com_whjin5804;

public class Animal {
	
	public void sound() {
		System.out.println("µ¿¹°ÀÌ ¿ó´Ï´Ù.");
	}
}

class Dog extends Animal{
	
	public void sound() {
		System.out.println("¸Û¸Û");
	}
}

class Cat extends Animal{
	
	public void sound() {
		System.out.println("¾ß¿Ë");
	}
}

class Cow extends Animal{
	
	public void sound() {
		System.out.println("À½¸Þ");
	}
}