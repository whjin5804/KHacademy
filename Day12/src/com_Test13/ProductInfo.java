package com_Test13;

import java.util.Scanner;

public class ProductInfo {
	static Scanner sc = new Scanner(System.in);
	private static String explainProd;
	private static String productor;
	private static String price;
	
	public static void ProductInfo() {	//add situation
		System.out.print("Product Explain : ");
		explainProd = sc.nextLine();
		System.out.print("Productor : ");
		productor = sc.nextLine();
		System.out.print("Price : ");
		price = sc.nextLine();
	}
	
	public static void main(String[] args) {
		Product[] product = new Product[10];
		int cnt = 0;
		int choice = 0;
		ConversationBook c1 = null;
		CompactDisc c2;
		String bookName = "";
		String maker = "";
		String language = "";
		String isbn = "";
		String albumTitle = "";
		String singerNameInfo = "";
		
		
		do {
			System.out.print("Add<1>, Search<2>, End<3>>>");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1 :
				System.out.print("Product kind Book<1>, MusicCD<2>, converBook<3>>>");
				int kind = sc.nextInt();	//switch�� ������
				sc.nextLine();
				switch (kind) {			//Add
				case 1:
					ProductInfo();
					System.out.print("Book name : ");
					bookName = sc.nextLine();
					System.out.print("Maker : ");
					maker = sc.nextLine();
					System.out.print("language : ");
					language = sc.nextLine();
					System.out.print("ISBN : ");
					isbn = sc.nextLine();
					c1 = new ConversationBook(explainProd, productor, price, isbn, maker, bookName, language);
					System.out.println();
					break;
				case 2:
					ProductInfo();
					System.out.print("Album title : ");
					albumTitle = sc.nextLine();
					System.out.print("Singer name : ");
					singerNameInfo = sc.nextLine();
					c2 = new CompactDisc(explainProd, productor, price, albumTitle, singerNameInfo);
					System.out.println();
					break;
				default:
					break;
				}
				break;
			case 2:
				product[cnt++] = new ConversationBook(explainProd, productor, price, isbn, maker, bookName, language);
				product[cnt++] = new CompactDisc(explainProd, productor, price, albumTitle, singerNameInfo);
				for (int i = 0; i < cnt; i++) {
					product[i].print();
					System.out.println();
				}
				break;
			default:
				break;
			}
		}while(choice == 1 || choice == 2);

		sc.close();
	}
}
