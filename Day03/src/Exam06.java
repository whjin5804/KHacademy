import java.util.Scanner; 

public class Exam06 {
	public static void main(String[] args) {
		//글을 쓸 수 있는 붓을 하나 획득.
		Scanner sc = new Scanner(System.in);
		
		//문자 입력
		String str = "";
		str = sc.nextLine();	//문자열을 입력
		System.out.println(str);
		
		int val = 0;
		val = sc.nextInt();
		System.out.println(val);
	}
}
