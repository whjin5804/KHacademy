import java.util.ArrayList;
import java.util.List;

public class List3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("���");
		list.add("����");
		list.add("���");
		list.add("ȫ�浿");
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("ȫ�浿")) {
				System.out.println("�ش� �̸��� �����մϴ�.");
			}
		}
		
		for (String e : list) {
			if (e.equals("ȫ�浿")) {
				System.out.println("�ش� �̸��� �����մϴ�.");
			}
		}

		
		
	}
}
