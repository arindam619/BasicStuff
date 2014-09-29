
public abstract class Vechile {

	public int door = 4;
	public int wheel = 4;
	public int gear;
	
	public Vechile(int gear) {
		this.gear = gear;
	}
	
	
	public abstract void move(int speed);
	
	
}
