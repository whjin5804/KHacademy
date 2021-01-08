import java.util.Random;
import java.util.Scanner;

public class Exam17 {
	public static void main(String[] args) {
		int randomNum = 0;
		int scanNum;
		int zero = 0;
		int nine = 99;
		
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		randomNum = rn.nextInt(99)+1;
		
		System.out.println("수를 결정하였습니다. 맞추어 보세요");
		System.out.println("0-99");
		
		for(int i = 0; i < 100; i++) {
			
			System.out.print(i + ">>");
			scanNum = sc.nextInt();
			sc.nextLine();
			if(scanNum < randomNum) {
				System.out.println("더 높게");
				System.out.println(scanNum + "-" + nine);
				zero = scanNum;
			}
			else if(scanNum > randomNum) {
				System.out.println("더 낮게");
				System.out.println(zero + "-" + scanNum);
				nine = scanNum;
			}
			else {
				System.out.println("맞았습니다");
				System.out.println("다시하시겠습니까(y/n)>>");
				String tellYesNo = sc.nextLine();
				if(tellYesNo.equals("y")) {
					System.out.println("수를 결정하였습니다. 맞추어 보세요");
					continue;
				}
				else {
					break;
				}
			}

		}
		
		

	}
}
