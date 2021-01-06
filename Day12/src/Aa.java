class Bb{
	
}

class Cc{
	
}

public class Aa {
	public static void main(String[] args) {
		Object o1 = new Cc();
		Object o2 = new Bb();
		
		System.out.println(o2.toString());
		
		int[] a = new int[5];
		System.out.println(a);				//[I@4926097b
		System.out.println(a.toString());	//[I@4926097b
		
	}
}
