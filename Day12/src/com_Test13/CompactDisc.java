package com_Test13;

public class CompactDisc extends Product{
	private String albumTitle;
	private String singerNameInfo;
	
	public CompactDisc(String explainProd, String productor, String price, String albumTitle, String singerNameInfo) {
		super(explainProd, productor, price);
		this.albumTitle = albumTitle;
		this.singerNameInfo = singerNameInfo;
	}
}
