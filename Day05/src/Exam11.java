
public class Exam11 {
	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		int temp;
		
		max = array[0];
		for (int i = 0; i < array.length; i++) {
			if(max < array[i])
				max = array[i];
		}
		System.out.println("max: " + max);
		System.out.println("天天3-3天天");
		for (int j = 0; j < array.length; j++) {
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					temp = array[i + 1];
					array[i + 1] = array[i];
					array[i] = temp;
				}
			}
		}

		for (int j = 0; j < array.length; j++) {
			System.out.println(array[j]);
		}

	}
}
