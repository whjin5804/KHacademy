
public class StudentObj implements Cloneable {
	 String stuNum;
	 String name;
	 int age;
	
	
	public StudentObj(String stuNum, String name, int age) {
		this.stuNum = stuNum;
		this.name = name;
		this.age = age;
	}

	public String getStuNum() {
		return stuNum;
	}
	
	public int getAge() {
		return age;
	}

	//toString() �������̵�
	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {			//�������� �񱳷� �ϰ�ʹٸ�?
		// Object obj�� ������ �� �޼ҵ�� �Ű������� ������ ���ü��ִ�. Object�� �ֻ���Ŭ�����ϱ�
		if(stuNum.equals(((StudentObj)obj).getStuNum()) || age == ((StudentObj)obj).getAge()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	/*
	 * obj�� �й��� �ޱ����ؼ�.
	 * student�� ���������ϱ� �й��� ������� ������ object�� �𸥴�.
	 * �׷��⶧���� ����ȯ�� ���ؼ� �˷��ش�
	 * �׷��� private�� �������ֱ⶧���� setter getter�� ���ؼ� �����Ѵ�.
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
