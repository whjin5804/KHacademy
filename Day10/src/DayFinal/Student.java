package DayFinal;

public class Student {
	private PersonInfo personInfo;
	private Sungjuk sungjuk;
	
	public Student() {
		personInfo = new PersonInfo();
		sungjuk = new Sungjuk();
	}
	
	public void setInfo(String name, int age, String addr) {
		personInfo.setInfo(name, addr, age);
	}
	
	public void setSungjuck(int korScore, int engScore, int mathScore) {
		sungjuk.setSungjuck(korScore, engScore, mathScore);
	}

	public void displayStudentInfo() {
		personInfo.displayInfo();
		sungjuk.displayStudentInfo();
	}
	
}
