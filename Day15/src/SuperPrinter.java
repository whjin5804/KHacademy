
public interface SuperPrinter {
	void print();
		
}

interface SubPrinter extends SuperPrinter{
	void colorPrint();
	
}



class Myprinter implements SubPrinter{
	Myprinter p = new Myprinter();
	SubPrinter p1 = new Myprinter();
	Object p2 = new Myprinter();
	SuperPrinter p3 = new Myprinter();

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void colorPrint() {
		// TODO Auto-generated method stub
		
	}
	
}