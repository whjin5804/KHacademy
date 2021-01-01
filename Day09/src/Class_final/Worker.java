package Class_final;

public class Worker {
<<<<<<< HEAD

	private int korScore;
	private int engScore;
	private int mathScore;
	
	public Worker() {
		korScore = 0;
		engScore = 0;
		mathScore = 0;
	}

	public void setSongjuk(int korScore, int engScore, int mathScore) {
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}
=======
	WorkInfo workInfo = new WorkInfo();
>>>>>>> e7bbef3c62a11ac89340c52c2d10bf488f94eb89
	
	public void setWorkInfo(String companyNmae, String workPlace, int price) {
		workInfo.setWorkInfo(companyNmae, workPlace, price);
	}
	
	public void displayWoker() {
		workInfo.displayWoker();
	}
	
	
	PersonInfo personInfo = new PersonInfo();
	public void setInfo(String name, String address, int age){
		personInfo.setInfo(name, address, age);
	}
	
	
}
