package test13;

public class Book extends Product {
	private String isbnNum;
	private String author;
	private String title;
	
	public void setInfo(int id) {
		super.setInfo(id);
		System.out.print("ISBN>>");
		isbnNum = Product.sc.nextLine();
		System.out.print("����>>");
		author = Product.sc.nextLine();
		System.out.print("å ����>>");
		title = Product.sc.nextLine();
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("ISBN>>" + isbnNum);
		System.out.println("����>>" + author);
		System.out.println("å ����>>" + title);
	}
	

}
