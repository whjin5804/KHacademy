package test13;

public class CompactDisc extends Product{

	private String album;
	private String artist;
	
	public void setInfo(int id) {
		super.setInfo(id);
		System.out.print("�ٹ� ����>>");
		album = Product.sc.nextLine();
		System.out.print("����>>");
		artist = Product.sc.nextLine();
	}
	
	public void printInfo() {
		super.printInfo();
		System.out.println("�ٹ� ����>>" + album);
		System.out.println("����>>" + artist);
		
	}
	
	
}
