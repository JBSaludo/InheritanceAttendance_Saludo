package Inheritance;

public class U_2_Spy_Plane extends Vehicles {

int wingspan = 103;
	
	void fly() {
		System.out.println("The Plane is taking off");
	}
	
	//Overrides the Stop method from the Vehicle class
	@Override
	void stop() {
		System.out.println("The plane was landed ");
	}
}

