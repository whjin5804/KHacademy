import java.util.Scanner;

public class MemberServiceExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean result;
		
		do {
			System.out.println("�̸��� �Է��ϼ���");
			String name = sc.nextLine();
			System.out.println("��й�ȣ�� �Է��ϼ���");
			String password = sc.nextLine();
			
			MemberService memberService = new MemberService();
			result = memberService.login(name,password);
			if(result) {
				System.out.println("�α��� �Ǿ����ϴ�.");
				memberService.logout("hong");
			}
			else {
				System.out.println("id �Ǵ� password�� �ùٸ��� �ʽ��ϴ�.");
				System.out.println("�ٽ� �Է��ϼ���");
			}
		}while(result == false);
			
			
	}
}
