package Test10;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class TestMember2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Member1> list = new ArrayList<>();
		int choice;
		int i = 0;
		int cnt = 0;
		int k = 0;
		int p = 0;
		
		do {
			System.out.print("등록<1> 조회<2> 모든조회<3> 삭제<4> 비밀번호변경<5>");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {	//등록,조회~
			case 1 :	//등록
				//새로운 객체를 만든다.
				System.out.print("회원이름 : ");
				String name = scanner.nextLine();
				System.out.print("아이디 : ");
				String id = scanner.nextLine();
				System.out.print("비밀번호 : ");
				String pwd = scanner.nextLine();
				list.add(new Member1(id, name, pwd));
				cnt++;
				break;
			case 2 :
				do {
				System.out.print("정보를 조회할 이름 : ");
				String nameString = scanner.nextLine();
					if(nameString.equals(list.get(k).getName())) {
						System.out.println(list.get(k).getName() + "님의 정보는 아래와 같습니다.");
						System.out.println(list.get(k));
						k++;
						break;
				}
					if (k == 0) {
						System.out.println("정보가 일치하는 회원이 없습니다.");
					}
				} while (k == 0);
				
				break;
			case 3 :
				System.out.println("회원 수는 " + cnt + "명이며 정보는 다음과 같습니다.");
				for (int j = 0; j < list.size(); j++) {
					System.out.println(list.get(j));
					System.out.println();
				}
				break;
			case 4 :
				do {
					System.out.print("삭제할 이름을 입력하세요");
					String rmname = scanner.nextLine();
					for (int j = 0; j < list.size(); j++) {
						if(rmname.equals(list.get(j).getName())) {
							list.remove(j);
							System.out.println("삭제되었습니다.");
							p++;
							cnt--;
						}
					}
					
					if(p == 0) {
						System.out.println("이름이 없습니다.");
					}
				} while (p == 0);
				break;
			}
				
			
			
		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
		
		
		
		
	}

}
