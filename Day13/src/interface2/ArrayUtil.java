package interface2;

public interface ArrayUtil {

	//배열의 길이를 리턴
	public int getArrayLength(int[] arr);
	
	//배열 모든 요소 중 최대값 리턴
	public int getArrayMax(int[] arr);
	
	//배열 모든 요소의 평균을 리턴
	public double getArrayAvg(int[] arr);
	
	//매개변수로 받은 두 배열이 같으면 true를 리턴
	//같다는 의미는 모든 요소의 값이 같음을 의미
	public String isEqualsArr(int[] arr1, int[] arr2);
}

class MyArray implements ArrayUtil{

	@Override
	public int getArrayLength(int[] arr) {
		return arr.length;
	}

	@Override
	public int getArrayMax(int[] arr) {
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	@Override
	public double getArrayAvg(int[] arr) {
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		avg = (double)sum / arr.length;
		return avg;
	}

	@Override
	public String isEqualsArr(int[] arr1, int[] arr2) {
		int cnt = 0;
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i] == arr2[i]) {
				cnt++;
			}
		}	//for
		if(cnt == arr1.length) {
			return " 같습니다";
		}
		else {
		return " 다릅니다";
		}
	}
	
	
}