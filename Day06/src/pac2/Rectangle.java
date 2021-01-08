package pac2;

public class Rectangle {
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	
	public Rectangle() {
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}
	
	public Rectangle(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}

	public void set(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	public int square() {
		return Math.abs((x1-x2)) * Math.abs(y1-y2);
	}
	
	public void show() {
		System.out.println("x1ÀÇ ÁÂÇ¥´Â : (" + x1 + "," + y1 + ") (" + x2 + "," + y2 + ")");
		System.out.println("³ÐÀÌ´Â" + square());
	}
	

	boolean equals(Rectangle r) {
		if(r.square() == square()) {
			return true;
		}
		else {
			return false;
		}
	}
	
}
