package interface2;

import java.util.ArrayList;

public class ArrayManager {

	public static void main(String[] args) {
		ArrayUtil arrayUtil = new MyArray();
		int[] arr1 = {12, 7, 10, 5, 8};
		int[] arr2 = {3, 7, 10, 5, 4};
		
		System.out.println("�迭�� ���̴� " + arrayUtil.getArrayLength(arr1) + "�Դϴ�");
		System.out.println("arr1 �迭�� �ִ밪�� " + arrayUtil.getArrayMax(arr1) + "�Դϴ�");
		System.out.println("arr1 �迭�� ����� " + arrayUtil.getArrayAvg(arr1) + "�Դϴ�");
		System.out.println("�迭 arr1�� �迭arr2�� ����" + arrayUtil.isEqualsArr(arr1, arr2));
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("�ȳ�");
		
		for (int i = 0; i < arrList.size(); i++) {
			System.out.println(arrList.get(i));
		}
	}

}
