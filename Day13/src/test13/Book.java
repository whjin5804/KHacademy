package test13;

public class Book extends Product {
	private String isbnNum;
	private String author;
	private String title;
	
	public void setInfo(int id) {
		super.setInfo(id);
		System.out.print("ISBN>>");
		isbnNum = Product.sc.nextLine();
		System.out.print("历磊>>");
		author = Product.sc.nextLine();
		System.out.print("氓 力格>>");
		title = Product.sc.nextLine();
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("ISBN>>" + isbnNum);
		System.out.println("历磊>>" + author);
		System.out.println("氓 力格>>" + title);
	}
	

}
