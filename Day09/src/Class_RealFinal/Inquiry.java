package Class_RealFinal;

public class Inquiry {
	Reserve reserve = new Reserve();
	
	public void inquiry() {
		System.out.print("S>>");
		for (int i = 0; i < 10; i++) {
			System.out.print(reserve.getSeatS() + " ");
		}
		
		System.out.println();
		System.out.print("A>>");
		for (int j = 0; j < 10; j++) {
			System.out.print(reserve.seatA[j] + " ");
		}
		System.out.println();
		System.out.print("B>>");
		for (int j = 0; j < 10; j++) {
			System.out.print(reserve.seatB[j] + " ");
		}
		System.out.println();
		System.out.println("조회를 완료하였습니다.");
	}
	
	
	
}
