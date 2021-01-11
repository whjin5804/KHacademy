package Test10;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMember2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Member1> list = new ArrayList<>();
		Member1 member1 = new Member1();
		int choice;
		int i = 0;
		
		do {
			System.out.print("등록<1> 조회<2> 모든조회<3> 삭제<4> 비밀번호변경<5>");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {	//등록,조회~
			case 1 :	//등록
				//새로운 객체를 만든다.
				System.out.print("회원이름 : ");
				String name = scanner.nextLine();
				member1.setName(name);
				System.out.print("아이디 : ");
				String id = scanner.nextLine();
				member1.setId(id);
				System.out.print("비밀번호 : ");
				String pwd = scanner.nextLine();
				member1.setPwd(pwd);
				list.add(member1);
				break;
			case 2 :
				System.out.print("정보를 조회할 이름 : ");
				String nameString = scanner.nextLine();
				for (int j = 0; j < list.size(); j++) {
					if(nameString.equals(list.get(j).getName())) {
						System.out.println(list.get(j).getName() + "님의 정보는 아래와 같습니다.");
						list.get(j);
						break;
					}
					else {
						System.out.println("정보가 일치하는 회원이 없습니다.");
					}
				}
			
			}
			
			
			
		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
		
		
		
		
	}

}
