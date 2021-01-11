import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class List1 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		//< >안에는 자료형이 들어가면된다(기본자료형은 불가-wrapper클래스 사용), 이 리스트에는 문자열만 들어가는 것임
		//뒤에는 어차피 앞에꺼랑 똑같아서 생략가능
		List<String> list1 = new LinkedList<>();	//무조건 이형태로 사용
		
		//add, get, remove, size
		list1.add("java");
		list1.add("C++");
		list1.add("Python");
		list1.add("Python");
//		list1.add(13); 문자열인데 숫자나오면 오류
		System.out.println(list1.get(2)); //1번쨰 데이터를 읽어드린다.
		list1.remove(1);
		System.out.println(list1.get(1)); //1번쨰 데이터를 읽어드린다.
		
		List<Integer> list2 = new ArrayList<>(); 
		list2.add(5);
		list2.add(6);
		list2.add(7);
		System.out.println(list2.size());
		
		for (int i = 0; i < list2.size(); i++) {
			System.out.println(list2.get(i));
		}
		
		
	}
}
