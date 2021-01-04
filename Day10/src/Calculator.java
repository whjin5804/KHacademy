import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String oper;
		
		do {
			System.out.print("첫 번째 수 : ");
			int a = sc.nextInt();
			System.out.print("두 번째 수 : ");
			int b = sc.nextInt();
			sc.nextLine();
			System.out.print("연산자 : ");
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
					System.out.println("잘못된 연산자를 입력하였습니다.");
			}		
		}while(!oper.equals("+") || !oper.equals("-") || !oper.equals("*") || !oper.equals("/"));
		
		
	}
}
