
public class Exam06 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		int[] arr1 = {1, 2, 3};
		
		String[] str = {"Java", "C++", "Python"};
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		// arr�迭�� ��� ��ҿ� 5�� ����
		for(int i = 0; i < arr.length; i++) {
			arr[i] = 5;
			System.out.println(arr[i]);
		}

		// arr �迭�� ���̸� ���
		System.out.println(arr.length);

	}
}
