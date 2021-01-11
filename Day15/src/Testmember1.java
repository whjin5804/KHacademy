import java.util.ArrayList;
import java.util.List;

public class Testmember1 {
	public static void main(String[] args) {
		List<Member> list = new ArrayList<>();
		Member member = new Member();
		Member member2 = new Member();
		int sum = 0;
		
		
		member.setId("bbb");
		member.setPwd("123");
		member.setName("¿”≤©¡§");
		member.setAge(32);
		
		
		member2.setId("a");
		member2.setPwd("1232");
		member2.setName("≥Õ∞∆¡§");
		member2.setAge(42);
		
		list.add(member);
		list.add(member2);
		list.add(new Member("java", "123", "±Ë±Êµø", 20));
		
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
//		for(Member e : list) {
//			System.out.println(e);
//		}
		
		
		
		int ageSum = 0;
		for (int i = 0; i < list.size(); i++) {
			ageSum += list.get(i).getAge();
		}
		
		
		int ageSum2 = 0;
		for(Member e : list) {
			ageSum2 += e.getAge();
		}
		
		System.out.println(ageSum);
		System.out.println(ageSum2);
		
		
		for (int i = 0; i < list.size(); i++) {
			if(list.get(i).getId().equals("java")) {
				list.remove(i);
			}
		}
		
		
		
	}

}
