
public class StudentManage {
	public static void main(String[] args) {
		Student stu1 = new Student();
		Student stu2 = new Student();
		
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.score);
		
		stu2.name = "ȫ�浿";
		stu2.age = 20;
		stu2.score = 90;
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.score);
	}
}
