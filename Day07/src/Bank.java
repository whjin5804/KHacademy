
public class Bank {
	public static void main(String[] args) {
		//���¸� �ϳ� ����
		//Account Ŭ������ ���� ��ü(�ν��Ͻ�) ����
		//Ŭ������ ������ = new Ŭ������()
		Account ac = new Account();
		Account ac1;	//���������� ����
		ac1 = new Account();	//���������� ����
		int a = ac.balance;
		System.out.println(a);
		
		ac.balance = 2000;
		System.out.println(ac.balance);
		ac.deposit(1000);
		System.out.println(ac.balance);
		System.out.println(ac1.balance);
		
		
	}

}
