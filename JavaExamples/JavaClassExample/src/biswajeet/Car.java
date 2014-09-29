package biswajeet;

public abstract class Car implements Vehicle {
	
	public int wheels = 4;
	public int doors = 4;
	
	public int grear;
	
	public abstract void move();
	
	public abstract void milage();
	
	public abstract void maxSpeed();	

}
