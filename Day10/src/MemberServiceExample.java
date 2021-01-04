import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result;
		
		do {
			System.out.println("이름을 입력하세요");
			String name = sc.nextLine();
			System.out.println("비밀번호를 입력하세요");
			String password = sc.nextLine();
			
			MemberService memberService = new MemberService();
			result = memberService.login(name,password);
			if(result) {
				System.out.println("로그인 되었습니다.");
				memberService.logout("hong");
			}
			else {
				System.out.println("id 또는 password가 올바르지 않습니다.");
				System.out.println("다시 입력하세요");
			}
		}while(result == false);
			
			
	}
}
