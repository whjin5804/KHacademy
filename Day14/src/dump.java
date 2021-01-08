
class Data{
	int x;	//10 // //10
	
	static void call() {
		System.out.println("call");
	}
}


public class dump {
	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		Data.call();
		
		Data d2 = copy(d);
		System.out.println("d.x =" + d.x);
		System.out.println("d2.x =" + d2.x);
	}

	private static Data copy(Data d) {
		Data tmp = new Data();
		tmp.x = d.x;
		
		return tmp;
	}

}
