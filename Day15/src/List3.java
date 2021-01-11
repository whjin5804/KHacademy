import java.util.ArrayList;
import java.util.List;

public class List3 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("김김");
		list.add("김이");
		list.add("김박");
		list.add("홍길동");
		
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("홍길동")) {
				System.out.println("해당 이름이 존재합니다.");
			}
		}
		
		for (String e : list) {
			if (e.equals("홍길동")) {
				System.out.println("해당 이름이 존재합니다.");
			}
		}

		
		
	}
}
