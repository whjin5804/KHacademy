
public class Circle {
	//member variables declare
	private double rad;
	final double PI;
	
	//constructor
	public Circle(){
		rad = 0.0;
		PI = 3.14;
	}
	
	//set method of date as radio
	public void setRad(double r) {
		if(r < 0) {
			rad = 0;
			return ;
		}
		rad =r;
	}
	
	//return method of area as circle
	public double getArea() {
		return rad * rad * PI;
	}
	
}
