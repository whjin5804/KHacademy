package DayFinal;

public class WorkManager {
	public static void main(String[] args) {
		Worker w = new Worker();
		w.setInfo("김자바", "울산", 20);
		w.setWorkInfo("삼성", "무선사업부", 50000);
		w.displayWorker();
	}
}
