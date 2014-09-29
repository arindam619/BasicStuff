package biswajeet;

public class CarModelWatch {

	public static void main(String[] args) {
		
		
		//M800
		M800 m800 = new M800("M800", 4);
		
		m800.freeServicing();
		m800.maxSpeed();
		m800.milage();
		m800.move();
		
		System.out.println("--------------------------------->");
		
		//Alto
		Alto alto = new Alto("AK10", 5);
		
		alto.freeServicing();
		alto.maxSpeed();
		alto.milage();
		alto.move();
		
		
		//check for obj type
		if ( m800 instanceof Car ) {
			System.out.println("m800 is an obj of type Car");
		}
		
		if ( m800 instanceof MarutiCar ) {
			System.out.println("m800 is an obj of type MarutiCar");
		}

		if ( m800 instanceof M800 ) {
			System.out.println("m800 is an obj of type M800");
		}
		
		System.out.println("--------------------------------->");
		
		if ( m800.getClass().isInstance(alto)  )
			System.out.println("m800 is an obj of type Alto");
			
		else
			System.out.println("m800 is not an obj of type Alto");
		
		
	}

}
