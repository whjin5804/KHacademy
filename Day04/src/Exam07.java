import java.util.Scanner;

public class Exam07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = sc.nextLine();
		
		switch (gender) {
		case "남" :
			System.out.println("남자입니다.");
			break;
		case "여" :
			System.out.println("여자입니다.");
		}
		
		
		
	}
}
