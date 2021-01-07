
public class Exam15 {
	public static void main(String[] args) {
		int score = 96;
		String grade;
		
		if(score >= 90) {
			grade = "A";
			
			if(score >= 95) {
				grade = grade + "+";
			}
			else {
				grade = grade + "-";
			}
		}
		else {
			grade = "B";
		}
		System.out.println(grade);
		
	}
}
