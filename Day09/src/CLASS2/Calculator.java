package CLASS2;

public class Calculator {

	private int num1;
	private int num2;
	private String op1;
	private String op2;
	private String op3;
	private String op4;
	
	public Calculator() {
		num1 = 0;
		num2 = 0;
		op1 = "";
		op2 = "";
		op3 = "";
		op4 = "";
	}
	
	public void setPlus(int num1, int num2, String op1) {
		this.num1 = num1;
		this.num2 = num2;
		this.op1 = op1;
	}
	
	public int getPlus() {
		return num1 + num2;
	}

	public void setMinus(int num1, int num2, String op2) {
		this.num1 = num1;
		this.num2 = num2;
		this.op2 = op2;
	}
	
	public int getMinus() {
		return num1 - num2;
	}
	
	public void setMulti(int num1, int num2, String op3) {
		this.num1 = num1;
		this.num2 = num2;
		this.op3 = op3;
	}
	
	public int getMulti() {
		return num1 * num2;
	}
	
	public void setDiv(int num1, int num2, String op4) {
		this.num1 = num1;
		this.num2 = num2;
		this.op4 = op4;
	}
	
	public double getDiv() {
		return (double)num1 / num2;
	}
	
}
