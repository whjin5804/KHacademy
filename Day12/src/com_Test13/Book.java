package com_Test13;

public class Book extends Product{
	private String isbnNum;
	private String maker;
	private String bookTitleInfo;
	
	public Book(String explainProd, String productor, String price, String isbnNum, String maker, String bookTitleInfo) {
		super(explainProd, productor, price);
		this.isbnNum = isbnNum;
		this.maker = maker;
		this.bookTitleInfo = bookTitleInfo;
	}

	public String getMaker() {
		return maker;
	}

	public String getBookTitleInfo() {
		return bookTitleInfo;
	}
	
	public String getIsbnNum() {
		return isbnNum;
	}


}
