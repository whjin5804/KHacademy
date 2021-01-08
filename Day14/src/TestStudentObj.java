
public class TestStudentObj {
	public static void main(String[] args) throws CloneNotSupportedException {
		StudentObj stu1 = new StudentObj("1111", "È«±æµ¿", 20);
		StudentObj stu2 = new StudentObj("2222", "È«¹Úµ¿", 30);
		StudentObj stu3 = new StudentObj("1243", "À¯¹Ú±è", 40);
		StudentObj stu4 = new StudentObj("11112", "È«±æµ¿", 20);
		
		System.out.println(stu1.toString());
		System.out.println(stu2);
		
		
		if(stu1 == stu4) {
			System.out.println(1);
		}
		if(stu1.equals(stu4)) {
			System.out.println(2);
		}
		
		
		StudentObj stu5 = new StudentObj("1111", "È«±æµ¿", 20);
		StudentObj stu6 = (StudentObj)stu5.clone();
		stu6.name = "±è±æµ¿";
		System.out.println(stu5);	//"1111", "±è±æµ¿", 20
		System.out.println(stu6);	//"1111", "±è±æµ¿", 20
		
		
		
	}

}
