package Class_final;

public class Student1 {
	PersonInfo personInfo = new PersonInfo();
	public void setInfo(String name, String address, int age) {
		personInfo.setInfo(name, address, age);
	}
	
	Sungjuk sungjuk = new Sungjuk();
	public void setSongjuk(int korScore, int engScore, int mathScore) {
		sungjuk.setSongjuk(korScore, engScore, mathScore);
	}
	
	public void displayStudentInfo() {
		sungjuk.displayStudentInfo();
	}
	
}
