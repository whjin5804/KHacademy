package ClASS3_1;

public class MemberMain1 {

	public static void main(String[] args) {
		Member1 m1 = new Member1("ȫ�浿","hong");
		Member1 m2 = new Member1("���ڹ�","java");
		
		MemberService memberService = new MemberService();
		boolean result = memberService.login("hong", "12345");
		if(result) {
			System.out.println("�α��� �Ǿ����ϴ�");
			memberService.logout("hong");
		}
		else {
			System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
		}
		
	}

}
