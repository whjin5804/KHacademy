package Class_final;

public class WorkerManager {
	public static void main(String[] args) {
		Worker w = new Worker();
		Student student = new Student();
		PersonInfo personInfo = new PersonInfo();
		personInfo.setInfo("��ȣ", "ȭ����", 50);
		personInfo.printInfo();
		w.displayStudentInfo();
		System.out.println();
		personInfo.setInfo("����", "���", 26);
		personInfo.printInfo();
		student.setWorkInfo("īī��", "����", 2500);
		student.displayWoker();
		
		
		
	}

}