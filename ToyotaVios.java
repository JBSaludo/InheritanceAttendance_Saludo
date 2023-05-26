package Inheritance;

public class ToyotaVios extends Vehicles {
String tireType = "Highway Tires";
	
	void drive() {
		System.out.println("The car was moving forward");
	}
	
	//Overrides the Stop method from the Vehicle class
	@Override
	void stop() {
		System.out.println("The car has stopped");
	}
	
}



