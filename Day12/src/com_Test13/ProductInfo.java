package com_Test13;

import java.util.Scanner;

public class ProductInfo {
	static Scanner sc = new Scanner(System.in);
	private static String explainProd;
	private static String productor;
	private static String price;
	
	public static void ProductInfo() {	//add situation
		System.out.print("상품 설명 : ");
		explainProd = sc.nextLine();
		System.out.print("생산자 : ");
		productor = sc.nextLine();
		System.out.print("가격 : ");
		price = sc.nextLine();
	}
	
	public static void main(String[] args) {
		Product[] product = new Product[10];
		ConversationBook c1 = null;
		CompactDisc c2;
		System.out.print("Add<1>, Search<2>, End<3>>>");
		int choice = sc.nextInt();
		System.out.print("상품 종류 Book<1>, MusicCD<2>, converBook<3>>>");
		int kind = sc.nextInt();	//switch로 가르기
		sc.nextLine();
		
			switch (kind) {			//Add
			case 1:
				ProductInfo();
				System.out.print("책 제목 : ");
				String bookName = sc.nextLine();
				System.out.print("저자 : ");
				String maker = sc.nextLine();
				System.out.print("언어 : ");
				String language = sc.nextLine();
				System.out.print("ISBN : ");
				String isbn = sc.nextLine();
				c1 = new ConversationBook(explainProd, productor, price, isbn, maker, bookName, language);
				System.out.println();
				break;
			case 2:
				ProductInfo();
				System.out.print("앨범 제목 : ");
				String albumTitle = sc.nextLine();
				System.out.print("가수 : ");
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
