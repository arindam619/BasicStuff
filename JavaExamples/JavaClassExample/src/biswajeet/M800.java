package biswajeet;

public class M800 extends MarutiCar {
	
	public String topSpeed = "120 KM/H";
	
	public M800(String model, int grear) {
		super(model, grear);
		
	}
	
	
	@Override
	public void freeServicing() {
		System.out.println("M800 have 2 nos. Free Servicing");
	}

	@Override
	public void milage() {
		System.out.println("M800 gives 22+ KM/L");
	}

	@Override
	public void maxSpeed() {
		System.out.println("M800 top speed: " + topSpeed);
	}



	@Override
	public void move() {
		System.out.println("Moving@..." + topSpeed );
	}

}
