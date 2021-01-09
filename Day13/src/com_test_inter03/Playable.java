package com_test_inter03;

public interface Playable {
	void turnOn();
	void turnOff();
	void sendMsg();
	void receiveMsg();
	public static int exec2(int i, int j){   //static �޼ҵ� 
        return i * j;
    }
		
}

class LgPhone implements Playable{

	@Override
	public void turnOn() {
		System.out.println("������ - ������ �Ҵ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("������ - ������ ����.");
	}

	@Override
	public void sendMsg() {
		System.out.println("������ - �޽����� ������.");
	}

	@Override
	public void receiveMsg() {
		System.out.println("������ - �޽����� �޴´�.");
	}
}

class SamsungPhone implements Playable{
	
	@Override
	public void turnOn() {
		System.out.println("�Ｚ�� - ������ �Ҵ�.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("�Ｚ�� - ������ ����.");
	}
	
	@Override
	public void sendMsg() {
		System.out.println("�Ｚ�� - �޽����� ������.");
	}
	
	@Override
	public void receiveMsg() {
		System.out.println("�Ｚ�� - �޽����� �޴´�.");
	}
}