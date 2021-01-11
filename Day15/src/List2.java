import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class List2 {
	public static void main(String[] args) {
		List<Integer> list3 = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			int num = scanner.nextInt();
			list3.add(num);
		}

		for (int i = 0; i < list3.size(); i++) {
			sum += list3.get(i);
		}
		
		int sum2 = 0;
		for(int e : list3) {
			sum2 = sum2 + e;
		}
		
		System.out.println(sum);
		System.out.println(sum2);
	}
}
