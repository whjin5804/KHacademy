import java.util.Scanner;

public class Exam09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		
		//2
		Scanner sc1 = new Scanner(System.in);
		System.out.print("점 (x, y)의 좌표를 입력하시오>>");
		int a1 = sc1.nextInt();
		int b1 = sc1.nextInt();
		
		if((a1 >= 50 && a1 <= 100) && (b1 >= 50 && b1 <= 100)) {
			System.out.println("사각형 안에 점이 있습니다.");
		}
		sc1.close();

	}
}
