package test13;

import java.util.Scanner;

public class Doswitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		switch (key) {
		case 1:
			while(key > 3) {
				System.out.println("3���ٳ���");
				break;
			}
		case 2:
			System.out.println("switch�� �´�.");
		}
		System.out.println("�����");
	}

}
