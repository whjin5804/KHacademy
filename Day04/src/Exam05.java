
public class Exam05 {
	public static void main(String[] args) {

		int score = 100;

		switch (score / 10) {
		case 9:
		case 10:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
		}

	}
}