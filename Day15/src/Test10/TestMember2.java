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
			System.out.print("���<1> ��ȸ<2> �����ȸ<3> ����<4> ��й�ȣ����<5>");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {	//���,��ȸ~
			case 1 :	//���
				//���ο� ��ü�� �����.
				System.out.print("ȸ���̸� : ");
				String name = scanner.nextLine();
				member1.setName(name);
				System.out.print("���̵� : ");
				String id = scanner.nextLine();
				member1.setId(id);
				System.out.print("��й�ȣ : ");
				String pwd = scanner.nextLine();
				member1.setPwd(pwd);
				list.add(member1);
				break;
			case 2 :
				System.out.print("������ ��ȸ�� �̸� : ");
				String nameString = scanner.nextLine();
				for (int j = 0; j < list.size(); j++) {
					if(nameString.equals(list.get(j).getName())) {
						System.out.println(list.get(j).getName() + "���� ������ �Ʒ��� �����ϴ�.");
						list.get(j);
						break;
					}
					else {
						System.out.println("������ ��ġ�ϴ� ȸ���� �����ϴ�.");
					}
				}
			
			}
			
			
			
		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
		
		
		
		
	}

}
