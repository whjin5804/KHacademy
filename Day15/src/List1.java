import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class List1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//< >�ȿ��� �ڷ����� ����ȴ�(�⺻�ڷ����� �Ұ�-wrapperŬ���� ���), �� ����Ʈ���� ���ڿ��� ���� ����
		//�ڿ��� ������ �տ����� �Ȱ��Ƽ� ��������
		List<String> list1 = new LinkedList<>();	//������ �����·� ���
		
		//add, get, remove, size
		list1.add("java");
		list1.add("C++");
		list1.add("Python");
		list1.add("Python");
//		list1.add(13); ���ڿ��ε� ���ڳ����� ����
		System.out.println(list1.get(2)); //1���� �����͸� �о�帰��.
		list1.remove(1);
		System.out.println(list1.get(1)); //1���� �����͸� �о�帰��.
		
		List<Integer> list2 = new ArrayList<>(); 
		list2.add(5);
		list2.add(6);
		list2.add(7);
		System.out.println(list2.size());
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		
	}
}
