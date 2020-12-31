
class Acc {
	static String accNumber;//123-11231-123
	static String owner;	//계좌 소유자
	static int balance;	//잔액
	
	//생성자
	public Acc() {
		accNumber = "미정2";
		owner = "미정e";
		balance = 1000;
	}
	
	//초기화 메소드
	public static void init() {
		accNumber = "미정";
		owner = "미정";
		balance = 1000;
	}
	
	//계좌정보출력
	public static void printAccInfo() {
		System.out.println("계좌번호는 = " + accNumber);
		System.out.println("소유주는 = " + owner);
		System.out.println("잔액은 = " + balance);
	}
	
}
