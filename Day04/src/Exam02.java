
public class Exam02 {

	public static void main(String[] args) {
		String str = "��";
		
		//str�� ���� "��"�̸� 1�� ���
		//str�� ���� "��"�̸� 2�� ���
		//str�� ���� "��"�̸� 3�� ���
		
		switch (str) {
		case "��" :
			System.out.println(1);
			break;
		case "��" :
			System.out.println(2);
			break;
		case "��" :
			System.out.println(3);
			break;
		default :
			System.out.println(4);

		}
	}
}
