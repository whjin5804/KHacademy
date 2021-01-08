
public class Exam12 {
	public static void main(String[] args) {
		int[] arr = new int[10];
		int max = 0;
		int min = 100;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random()*99+1);
			System.out.print(arr[i] + " ");
			if(max < arr[i])
				max = arr[i];
			if(min > arr[i]) {
				min = arr[i];
			}
		}		
		System.out.println();
		System.out.println(max);
		System.out.println(min);
	
		
		
	}
}
