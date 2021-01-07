package com_whjin5804_mkapp;

public class UnivFriend extends Friend{
	private String major;
	
	public UnivFriend(String name, String major, String phone) {
		super(phone, phone);
		this.major = major;
	}
	
	public void showInfo() {
		super.showInfo();
		System.out.println("Àü°øÀº : " +  major);
	}


}
