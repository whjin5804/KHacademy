package interface2;

public interface ArrayUtil {

	//�迭�� ���̸� ����
	public int getArrayLength(int[] arr);
	
	//�迭 ��� ��� �� �ִ밪 ����
	public int getArrayMax(int[] arr);
	
	//�迭 ��� ����� ����� ����
	public double getArrayAvg(int[] arr);
	
	//�Ű������� ���� �� �迭�� ������ true�� ����
	//���ٴ� �ǹ̴� ��� ����� ���� ������ �ǹ�
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
			return " �����ϴ�";
		}
		else {
		return " �ٸ��ϴ�";
		}
	}
	
	
}