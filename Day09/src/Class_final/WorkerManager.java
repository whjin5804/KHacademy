package Class_final;

public class WorkerManager {
	public static void main(String[] args) {
		Worker w = new Worker();
		Worker student = new Worker();
		PersonInfo personInfo = new PersonInfo();
		personInfo.setInfo("원호", "화봉고", 50);
		personInfo.printInfo();
		System.out.println();
		personInfo.setInfo("유진", "울산", 26);
		personInfo.printInfo();
		student.setWorkInfo("카카오", "서울", 2500);
		student.displayWoker();
		
		
		
	}

}
