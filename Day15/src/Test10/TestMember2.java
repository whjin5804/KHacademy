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
			System.out.print("���<1> ��ȸ<2> �����ȸ<3> ����<4> ��й�ȣ����<5>");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {	//���,��ȸ~
			case 1 :	//���
				//���ο� ��ü�� �����.
				System.out.print("ȸ���̸� : ");
				String name = scanner.nextLine();
				System.out.print("���̵� : ");
				String id = scanner.nextLine();
				System.out.print("��й�ȣ : ");
				String pwd = scanner.nextLine();
				list.add(new Member1(id, name, pwd));
				cnt++;
				break;
			case 2 :
				do {
				System.out.print("������ ��ȸ�� �̸� : ");
				String nameString = scanner.nextLine();
					if(nameString.equals(list.get(k).getName())) {
						System.out.println(list.get(k).getName() + "���� ������ �Ʒ��� �����ϴ�.");
						System.out.println(list.get(k));
						k++;
						break;
				}
					if (k == 0) {
						System.out.println("������ ��ġ�ϴ� ȸ���� �����ϴ�.");
					}
				} while (k == 0);
				
				break;
			case 3 :
				System.out.println("ȸ�� ���� " + cnt + "���̸� ������ ������ �����ϴ�.");
				for (int j = 0; j < list.size(); j++) {
					System.out.println(list.get(j));
					System.out.println();
				}
				break;
			case 4 :
				do {
					System.out.print("������ �̸��� �Է��ϼ���");
					String rmname = scanner.nextLine();
					for (int j = 0; j < list.size(); j++) {
						if(rmname.equals(list.get(j).getName())) {
							list.remove(j);
							System.out.println("�����Ǿ����ϴ�.");
							p++;
							cnt--;
						}
					}
					
					if(p == 0) {
						System.out.println("�̸��� �����ϴ�.");
					}
				} while (p == 0);
				break;
			}
				
			
			
		} while (choice == 1 || choice == 2 || choice == 3 || choice == 4);
		
		
		
		
	}

}
