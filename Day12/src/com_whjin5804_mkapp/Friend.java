package com_whjin5804_mkapp;

public class Friend {
	private String name;
	private String phone;
	
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	public void showInfo() {
		System.out.println("�̸� : " + name);
		System.out.println("����ó : " + phone);
	}
	
}
