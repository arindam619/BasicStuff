package biswajeet;

public class Alto extends MarutiCar {
	
	public String topSpeed = "140 KM/H";
	
	public Alto(String model, int grear) {
		super(model, grear);
	}

	@Override
	public void freeServicing() {
		System.out.println("Alto have 3 nos. Free Servicing");		
	}

	@Override
	public void milage() {
		System.out.println("Alto gives 20 KM/L");
		
	}

	@Override
	public void maxSpeed() {
		System.out.println("Alto top speed: " + topSpeed);
		
	}

	
	@Override
	public void move() {
		System.out.println("Moving@..." + topSpeed );
	}
	
}