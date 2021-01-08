
public class Bank {
	public static void main(String[] args) {
		//계좌를 하나 개설
		//Account 클래스에 대한 객체(인스턴스) 생성
		//클래스명 변수명 = new 클래스명()
		Account ac = new Account();
		Account ac1;	//참조변수를 선언
		ac1 = new Account();	//참조변수를 생성
		int a = ac.balance;
		System.out.println(a);
		
		ac.balance = 2000;
		System.out.println(ac.balance);
		ac.deposit(1000);
		System.out.println(ac.balance);
		System.out.println(ac1.balance);
		
		
	}

}
