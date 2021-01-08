package tutorial;
/*
 * 2
OOXXOXXOOO
OOXXOOXXOO
>10
  9
 */
import java.util.Scanner;

public class Tutorial3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.nextLine();
		int score = 0;
		String[] input = new String[80];
		char[] chs;
		char[] OX = {'O','X'};
		
		for(int i = 0; i < num; i++) {
			input[i] = sc.nextLine();
			chs = input[i].toCharArray();
			if(chs[i] == (OX[0])) {
				score += 1;
			}
			else{
				continue;
			}
		}
		System.out.println(score);
		
		
	}
}