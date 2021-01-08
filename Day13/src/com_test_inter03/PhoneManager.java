package com_test_inter03;

public class PhoneManager {

	public static void main(String[] args) {
		Playable play = new SamsungPhone();
		play.turnOn();
		play.turnOff();
		play.sendMsg();
		play.receiveMsg();
		
		System.out.println(Playable.exec2(2, 3));
	}

}
