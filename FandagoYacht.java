package Inheritance;

public class FandagoYacht extends Vehicles {
String MainsailColor = "Black";
	
	void Float() {
		System.out.println("The boat is sailing");
	}
	
	//Overrides the Stop method from the Vehicle class
	@Override
	void stop() {
		System.out.println("The boat drop the anchor");
	}
}


