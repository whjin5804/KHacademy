
public class Account {
	int balance = 0;	//�ܾ�
	
	//�Ա��ϴ� ���
	public void deposit(int money) {
		balance = balance +  money;
		System.out.println(money + "���� �Ա� ��");
	}
}
