package com_test_inter03;

public interface Playable {
	void turnOn();
	void turnOff();
	void sendMsg();
	void receiveMsg();
	public static int exec2(int i, int j){   //static 메소드 
        return i * j;
    }
		
}

class LgPhone implements Playable{

	@Override
	public void turnOn() {
		System.out.println("엘지폰 - 전원을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("엘지폰 - 전원을 끈다.");
	}

	@Override
	public void sendMsg() {
		System.out.println("엘지폰 - 메시지를 보낸다.");
	}

	@Override
	public void receiveMsg() {
		System.out.println("엘지폰 - 메시지를 받는다.");
	}
}

class SamsungPhone implements Playable{
	
	@Override
	public void turnOn() {
		System.out.println("삼성폰 - 전원을 켠다.");
	}
	
	@Override
	public void turnOff() {
		System.out.println("삼성폰 - 전원을 끈다.");
	}
	
	@Override
	public void sendMsg() {
		System.out.println("삼성폰 - 메시지를 보낸다.");
	}
	
	@Override
	public void receiveMsg() {
		System.out.println("삼성폰 - 메시지를 받는다.");
	}
}