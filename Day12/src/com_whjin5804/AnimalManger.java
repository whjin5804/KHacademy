package com_whjin5804;
/*
 * �����츮�� 5������ �������ִµ�
 * � ������ ��� �� �� ������?
 */

public class AnimalManger {
	public static void main(String[] args) {
//		Animal a = new Cat();
//		Animal b = new Dog();
//		Animal c = new Cow();
		
		
//		Dog[] dogs = new Dog[5];
//		Cat[] cats = new Cat[5];
//		Cow[] cows = new Cow[5];
		
		Animal[] animals = new Animal[5];
		animals[0] = new Dog();
		animals[1] = new Dog();
		animals[2] = new Dog();
		animals[3] = new Cat();
		animals[4] = new Cow();
		/*
		 * ���� 5���� ���� �� �ִ� ������ ������� ������
		 * �׷��Ƿ� �� �迭�� ��,�����,�Ұ� �� ���� �� �ִ�.
		 * 
		 */
		for (int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}
		
		
		
	}
}
