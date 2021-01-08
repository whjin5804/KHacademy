
public class Exam13 {
	public static void main(String[] args) {
		int[] arr = {5,4,3,2,1};
		int[] newArr = new int[5];
		
		System.out.println("天天天2-5天天天");
		for (int i = 0; i < newArr.length; i++) {
			newArr[i] = arr[i]; 
			System.out.println(newArr[i]);
		}
		
		
		System.out.println("天天天2-6天天天");
		int[] arr1 = {1,2,3,0,0,0,1,2,3};
		int[] arr2 = {4,5,6,7,8,9};
		int[] newArr1 = new int[arr1.length + arr2.length];
		
		for (int i = 0; i < newArr1.length; i++) {
			if(i < arr1.length)
				newArr1[i] = arr1[i];
			else if(i > arr1.length - 1) {
				newArr1[i] = arr2[i-arr1.length];
			}
			System.out.print(newArr1[i] + " ");
		}
		
	}
}
