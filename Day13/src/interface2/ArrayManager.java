package interface2;

import java.util.ArrayList;

public class ArrayManager {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new MyArray();
		int[] arr1 = {12, 7, 10, 5, 8};
		int[] arr2 = {3, 7, 10, 5, 4};
		
		System.out.println("배열의 길이는 " + arrayUtil.getArrayLength(arr1) + "입니다");
		System.out.println("arr1 배열의 최대값은 " + arrayUtil.getArrayMax(arr1) + "입니다");
		System.out.println("arr1 배열의 평균은 " + arrayUtil.getArrayAvg(arr1) + "입니다");
		System.out.println("배열 arr1과 배열arr2의 값은" + arrayUtil.isEqualsArr(arr1, arr2));
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("안녕");
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
