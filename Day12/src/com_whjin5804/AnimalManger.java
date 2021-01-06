package com_whjin5804;
/*
 * 동물우리에 5마리의 동물이있는데
 * 어떤 동물이 몇마리 씩 들어가 있을까?
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
		 * 동물 5개가 들어올 수 있는 공간을 만들었기 때문에
		 * 그러므로 각 배열에 개,고양이,소가 막 들어올 수 있다.
		 * 
		 */
		for (int i = 0; i < animals.length; i++) {
			animals[i].sound();
		}
		
		
		
	}
}
