import java.util.Scanner;

public class Exception01 {
	public static void main(String[] args) {
		System.out.println("���α׷� ����");
		Scanner sc = new Scanner(System.in);
		try {
			//���ܰ� �߻��� ������ �ִ� �ڵ带 �ۼ�
			int num1 = sc.nextInt();
			int num2 = sc.nextInt();
			System.out.println(num1 / num2);
		}catch(Exception e) {
			//���� �߻� �� ó���ϴ� �ڵ带 �ۼ�
			e.getMessage();
			e.printStackTrace();
			System.out.println("���ܰ� �߻��߽��ϴ�.");
		}
		finally { //���ܹ߻� ������ ���� ������ ����
			
		}
//		catch(ArithmeticException e) {
//		//���� �߻� �� ó���ϴ� �ڵ带 �ۼ�
//		System.out.println("���ܰ� �߻��߽��ϴ�.");
//		}
		
		
		System.out.println("���α׷� ����");
	}
	
}
