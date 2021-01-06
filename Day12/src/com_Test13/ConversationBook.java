package com_Test13;

public class ConversationBook extends Book{
	private String languageInfo;
	
	public ConversationBook(String explainProd, String productor, String price, String isbnNum, String maker, String bookTitleInfo, String languageInfo) {
		super(explainProd, productor, price, isbnNum, maker, bookTitleInfo);
		this.languageInfo = languageInfo;
	}
	
	public void print() {
		super.print();
		System.out.println("책 제목>>" + super.getBookTitleInfo());
		System.out.println("저자>>" + super.getMaker());
		System.out.println("언어>>" + languageInfo);
		System.out.println("ISBN>>" + super.getIsbnNum());
	}
	
	
}
