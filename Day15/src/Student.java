
//추상클래스 - 추상메소드를 하나 이상 가지고 있는 클래스
//객체 생성이 안된다.
//인터페이스랑 비슷하기때문에 추상메소드를 사용하려면 오버라이딩해야한다.
public abstract class Student {
	int a = 0;
	
	public Student() {
		
	}
	
	public void call() {
		
	}
	
	public abstract void bbb();
	
	
}

class Subclass extends Student{

	@Override
	public void bbb() {
		// TODO Auto-generated method stub
		
	}
	
}

