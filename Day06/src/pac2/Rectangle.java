package pac2;

public class Rectangle {
	private int x1;
	private int x2;
	private int y1;
	private int y2;
	
	Rectangle() {
		x1 = 0;
		x2 = 0;
		y1 = 0;
		y2 = 0;
	}
	
	public Rectangle(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public void setX1(int x1) {
		this.x1 = x1;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}
	
	void set(int x1, int x2, int y1, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	int square() {
		return (x1-x2) * (y1-y2);
	}
	
	void show() {
		System.out.println("x1ÀÇ ÁÂÇ¥´Â : " + x1);
		System.out.println("x2ÀÇ ÁÂÇ¥´Â : " + x2);
		System.out.println("y1ÀÇ ÁÂÇ¥´Â : " + y1);
		System.out.println("y2ÀÇ ÁÂÇ¥´Â : " + y2);
		System.out.println(square());
	}
	
	boolean equals(Rectangle r) {
		if(r.equals(s))
			return true;
	}
	
}
