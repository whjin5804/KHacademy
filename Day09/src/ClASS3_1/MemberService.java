package ClASS3_1;

public class MemberService {
	
	public boolean login(String id, String pwd) {
		if((id.equals("hong")) && (pwd.equals("12345"))){
			return true;
		}
		else {
			return false;
		}
	}
	
	public void logout(String id) {
		System.out.println("로그아웃 되었습니다");
	}
	
	
}
