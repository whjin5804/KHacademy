class A{
	private int x;
	private int y;
	
	public A() {
		this.x = 1;
		this.y = 1;
	}
	
	public void setX(int x) {
		this.x = x;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void dispA() {
		System.out.println(", x = " + x + ", y = " + y);
	}
}

class B extends A{
	private int x;
	private int y;
	
	public B() {
		this.x = 1;
		this.y = 1; 
	}
	
	public B(int x) {
		this(); 
		this.x = x; 
	}
	
	public B(int x, int y) { 
		this(); 
		this.x = x; 
		this.y = y; 
	}
	
	public B(int x, int y, int x1) {
		this();
		this.x = x;
		this.y = y;
		super.setX(x1);
	}
	
	public B(int x, int y, int x1, int y1) {
		this();
		this.x = x;
		this.y = y;
		super.setX(x1);
		super.setY(y1);
	}
	
	public void disp() {
		System.out.print("x = " + this.x + ", y = " + this.y);
		super.dispA();
	}

}


public class Work {
	public static void main(String[] args) {
		B bp = new B();
		B bp1 = new B(10);
		B bp2 = new B(10,20);
		B bp3 = new B(10,20,30);
		B bp4 = new B(10,20,30,40);
		bp.disp();
		bp1.disp();
		bp2.disp();
		
		bp3.disp();
		bp4.disp();
	}
}
