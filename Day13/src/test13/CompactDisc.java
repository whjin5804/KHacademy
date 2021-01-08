package test13;

public class CompactDisc extends Product{

	private String album;
	private String artist;
	
	public void setInfo(int id) {
		super.setInfo(id);
		System.out.print("举裹 力格>>");
		album = Product.sc.nextLine();
		System.out.print("啊荐>>");
		artist = Product.sc.nextLine();
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("举裹 力格>>" + album);
		System.out.println("啊荐>>" + artist);
		
	}
	
	
}
