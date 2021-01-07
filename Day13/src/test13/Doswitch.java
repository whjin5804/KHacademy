package test13;

import java.util.Scanner;

public class Doswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			while(key > 3) {
				System.out.println("3보다높네");
				break;
			}
		case 2:
			System.out.println("switch로 온다.");
		}
		System.out.println("종료됨");
	}

}
