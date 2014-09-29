
public abstract class Car extends Vechile {

	public Car(int gear) {
		super(gear);
	}

	@Override
	public void move(int speed) {
		int totalSpeed = this.gear * speed;
		System.out.println("Moving @" + totalSpeed);
	}
	
}
