
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

	//toString() 오버라이딩
	@Override
	public String toString() {
		return "Student [stuNum=" + stuNum + ", name=" + name + ", age=" + age + "]";
	}


	@Override
	public boolean equals(Object obj) {			//학점만을 비교로 하고싶다면?
		// Object obj를 넣으면 이 메소드는 매개변수로 모든것이 들어올수있다. Object가 최상위클래스니까
		if(stuNum.equals(((StudentObj)obj).getStuNum()) || age == ((StudentObj)obj).getAge()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	/*
	 * obj로 학번을 받기위해서.
	 * student를 생성했으니까 학번을 가지고는 있지만 object는 모른다.
	 * 그렇기때문에 형변환을 통해서 알려준다
	 * 그런데 private로 감춰져있기때문에 setter getter를 통해서 접근한다.
	 */

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
	
}
