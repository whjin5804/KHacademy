import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String oper;
		
		do {
			System.out.print("ù ��° �� : ");
			int a = sc.nextInt();
			System.out.print("�� ��° �� : ");
			int b = sc.nextInt();
			sc.nextLine();
			System.out.print("������ : ");
			oper = sc.nextLine();
			
			switch (oper) {
				case "+" :
					Add add = new Add();
					add.setValue(a, b);
					System.out.println(a + " " + oper + " " + b + " = " + add.calculate());
					break;
					
				case "-" :
					Sub sub = new Sub();
					sub.setValue(a, b);
					System.out.println(a + " " + oper + " " + b + " = " + sub.calculate());
					break;
					
				case "*" :
					Mul mul = new Mul();
					mul.setValue(a, b);
					System.out.println(a + " " + oper + " " + b + " = " + mul.calculate());
					break;
					
				case "/" :
					Div div = new Div();
					div.setValue(a, b);
					System.out.println(a + " " + oper + " " + b + " = " + div.calculate());
					break;
		
				default:
					System.out.println("�߸��� �����ڸ� �Է��Ͽ����ϴ�.");
			}		
		}while(!oper.equals("+") || !oper.equals("-") || !oper.equals("*") || !oper.equals("/"));
		
		
	}
}
