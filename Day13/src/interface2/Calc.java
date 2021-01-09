package interface2;

public interface Calc {

	public int sum(int a, int b);

	public int substract(int a, int b);

	public int multi(int a, int b);

	public double divide(int a, int b);
}

class Calculator implements Calc{

	@Override
	public int sum(int a, int b) {
		return a + b;
	}

	@Override
	public int substract(int a, int b) {
		return a -b;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		return a * b;
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		return (double)a / b;
	}
	
}
