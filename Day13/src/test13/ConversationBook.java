package test13;

public class ConversationBook extends Book{
	private String langInfo;
	
	public void setInfo(int id) {
		super.setInfo(id);
		System.out.print("언어>>");
		langInfo = Product.sc.nextLine();
	}
	
	
	public void printInfo() {
		super.printInfo();
		System.out.println("언어>>" + langInfo);
	}
	
}
