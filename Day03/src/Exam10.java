import java.util.Scanner;

public class Exam10 {
	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		int gameNum;
		
		System.out.print("1~99 ������ ������ �Է��Ͻÿ�>>");
		gameNum = sc2.nextInt();
		
		boolean ten369 = gameNum / 10 == 3 || gameNum / 10 == 6 || gameNum / 10 == 9;
		boolean one369 = gameNum % 10 == 3 || gameNum % 10 == 6 || gameNum % 10 == 9;
		
		if(ten369 && one369) {
			System.out.println("�ڼ�¦¦");
		}
		else if(ten369 || one369) {
			System.out.println("�ڼ�¦");
		}
		
		
		System.out.print("ù��° �� : ");
		int firNum = sc2.nextInt();
		System.out.print("�ι�° �� : ");
		int secNum = sc2.nextInt();
		
		int max = 0;
		int min = 0;
		if(firNum > secNum) {
				max = firNum;
				min = secNum;
		}
		else if(secNum > firNum) {
			max = secNum;
			min = firNum;
		}
		
		System.out.println(max+ " > " + min);
		
		
	}
}
