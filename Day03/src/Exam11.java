import java.util.Scanner;

public class Exam11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String gender = sc.nextLine();
		
		if(gender.equals("남")) {
			System.out.println("남자입니다");
		}
		else if(gender.equals("여")) {
			System.out.println("여자입니다.");
		}
	}
}
