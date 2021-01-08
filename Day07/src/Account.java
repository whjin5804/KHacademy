
public class Account {
	int balance = 0;	//잔액
	
	//입금하는 기능
	public void deposit(int money) {
		balance = balance +  money;
		System.out.println(money + "원이 입금 됨");
	}
}
