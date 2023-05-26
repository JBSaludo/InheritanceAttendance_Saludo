package Inheritance;

public class VehiclesMain {
	
	public static void main(String[] args) {
		
//		a.) Create a subclass of Car class and name it Toyota-VIOS, which has the following properties and methods (tire type and method drive());
		
		// Instance of Car class
		ToyotaVios Toyota_VIOS = new ToyotaVios();
		
		Toyota_VIOS.speed = 140;
		Toyota_VIOS.color = "White";
		Toyota_VIOS.price = 1500000 ;
		System.out.println(Toyota_VIOS.speed + "km/h");
		System.out.println(Toyota_VIOS.color);
		System.out.println("Php "+Toyota_VIOS.price);
		System.out.println(Toyota_VIOS.tireType);
		
		Toyota_VIOS.drive();
		Toyota_VIOS.stop();
		
		System.out.println("=================================================================================");
		
//		Create a subclass of Plane class and name it U-2 Spy Plane, which has the following properties and methods (wing span and method fly());
		// Instance of Plane class
		U_2_Spy_Plane U2_Spy_Plane = new U_2_Spy_Plane();
		
		U2_Spy_Plane.speed = 850;
		U2_Spy_Plane.color = "White";
		U2_Spy_Plane.price = 62000000;
		System.out.println(U2_Spy_Plane.speed + "km/h");
		System.out.println(U2_Spy_Plane.color);
		System.out.println("$"+U2_Spy_Plane.price);
		System.out.println(U2_Spy_Plane.wingspan+ " ft");
		
		U2_Spy_Plane.fly();
		U2_Spy_Plane.stop();
		
		System.out.println("=================================================================================");
		
//		Create a subclass of Boat class and name it Fandango Yacht, which has the following properties and methods (MainSail color and method float());
		// Instance of Boat class
		FandagoYacht Yacht = new FandagoYacht();
		
		Yacht.speed = 60;
		Yacht.color = "White";
		Yacht.price = 300000;
		System.out.println(Yacht.speed + "km/h");
		System.out.println(Yacht.color);
		System.out.println("$" + Yacht.price);
		System.out.println(Yacht.MainsailColor);
		
		Yacht.Float();
		Yacht.stop();
		
	}

}
