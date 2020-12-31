package ClASS3_1;

public class MemberMain1 {

	public static void main(String[] args) {
		Member1 m1 = new Member1("홍길동","hong");
		Member1 m2 = new Member1("강자바","java");
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("로그인 되었습니다");
			memberService.logout("hong");
		}
		else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		
	}

}
