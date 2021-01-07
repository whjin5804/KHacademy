package com_Test13;

import java.util.Scanner;

public class ProductInfo {
	static Scanner sc = new Scanner(System.in);
	private static String explainProd;
	private static String productor;
	private static String price;
	
	public static void ProductInfo() {	//add situation
		System.out.print("��ǰ ���� : ");
		explainProd = sc.nextLine();
		System.out.print("������ : ");
		productor = sc.nextLine();
		System.out.print("���� : ");
		price = sc.nextLine();
	}
	
	public static void main(String[] args) {
		Product[] product = new Product[10];
		ConversationBook c1 = null;
		CompactDisc c2;
		System.out.print("Add<1>, Search<2>, End<3>>>");
		int choice = sc.nextInt();
		System.out.print("��ǰ ���� Book<1>, MusicCD<2>, converBook<3>>>");
		int kind = sc.nextInt();	//switch�� ������
		sc.nextLine();
		
			switch (kind) {			//Add
			case 1:
				ProductInfo();
				System.out.print("å ���� : ");
				String bookName = sc.nextLine();
				System.out.print("���� : ");
				String maker = sc.nextLine();
				System.out.print("��� : ");
				String language = sc.nextLine();
				System.out.print("ISBN : ");
				String isbn = sc.nextLine();
				c1 = new ConversationBook(explainProd, productor, price, isbn, maker, bookName, language);
				System.out.println();
				break;
			case 2:
				ProductInfo();
				System.out.print("�ٹ� ���� : ");
				String albumTitle = sc.nextLine();
				System.out.print("���� : ");
				String singerNameInfo = sc.nextLine();
				c2 = new CompactDisc(explainProd, productor, price, albumTitle, singerNameInfo);
				System.out.println();
				break;
			default:
				break;
			}

			for (int i = 0; i < product.length; i++) {
				product[i] = new ConversationBook(explainProd, productor, price, explainProd, productor, price, explainProd);
				product[i].print();
			}
	}
}
