package interface2;

public interface Runnable {
	
	abstract void run();
}


interface Stop{
	
	void stop();
}

class Car implements Runnable, Stop{

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
}