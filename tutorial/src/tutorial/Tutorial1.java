package tutorial;

interface Attackable{
	void Attack(int x, int y);
}

interface Movable{
	void Move(String where);
}

interface Fightable extends Attackable, Movable{
	
}

class Fighter extends Unit implements Fightable {
	public void Attack(int x, int y) {
		System.out.println(x+y);
	}
	
	public void Move(String where) {
		System.out.println(where);
	}
}

class Unit {
	int x;
	int y;
	int currentHP;
}

public class Tutorial1 {
	public static void main(String[] args) {
		Fighter fh = new Fighter();
		fh.Attack(3, 4);
		fh.Move("hello");
		
		
	}
}
