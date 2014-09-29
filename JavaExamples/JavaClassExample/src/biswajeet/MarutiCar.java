package biswajeet;

public abstract class MarutiCar extends Car {
	
	public static final String MCAR_VER = "1.0";
	
	public String model;
	public boolean luxury;
	
	
	public MarutiCar(String model, int grear) {
		
		this.model = model;
		this.grear = grear;
		
	}
	
	
	public abstract void freeServicing();
	
	
}
