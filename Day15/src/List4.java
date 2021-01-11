import java.util.ArrayList;
import java.util.List;

public class List4 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		int sum = 0;
		int k = 0;
		
		for (int i = 0; i < 10; i++) {
			list.add((int) (Math.random()*100 + 1));
		}
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i) % 2 == 0) {
				sum += list.get(i);
				System.out.print(list.get(i) + " ");
				k++;
			}
		}
		
		System.out.println();
		int cnt = 0;
		int sum2 = 0;
		for(int e : list) {
			if(e % 2 == 0) {
				System.out.print(e + " ");
				cnt++;
				sum2 += e;
			}
		}
		System.out.println();
		System.out.println("Â¦¼öÀÇ °¹¼ö´Â " + cnt + "°³");
		System.out.println("Â¦¼öµéÀÇ ÇÕÀº " + sum2);
		
		System.out.println();
		
		System.out.println("Â¦¼öÀÇ °¹¼ö´Â " + k + "°³");
		System.out.println("Â¦¼öµéÀÇ ÇÕÀº " + sum);
		
		
		
	}

}
