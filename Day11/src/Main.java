
public class Main {
	public static void main(String[] args) {
		SungJuk sj = new SungJuk();
			PersonInfo pi = new PersonInfo(sj.getName(), sj.getJumin());
			sj.disp();
			pi.disp();
		
	}
}
