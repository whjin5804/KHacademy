import java.util.ArrayList;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		List<Student1> list = new ArrayList<>();
		list.add(new Student1("��浿", 90, 80));
		list.add(new Student1("����", 30, 80));
		list.add(new Student1("���", 90, 90));
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getSum() >= 150) {
				System.out.println("150���� �������� ������" + list.get(i));
			} 
		}
		
		int sum =0;
		double avg = 0;
		for (int i = 0; i < list.size(); i++) {
			sum += list.get(i).getSum();
		}
		
		System.out.println((double)sum / list.size());
		
		int first = 0;
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getSum() > first) {
				first = list.get(i).getSum();
			}
		}
		for (int j = 0; j < list.size(); j++) {
			if(list.get(j).getSum() == first) {
				System.out.println("���� 1���γ��� ������ " + list.get(j));
			}
		}
		
		
		
		
	}

}
