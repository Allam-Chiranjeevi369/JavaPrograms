package corejava4.classesAndObjects;

public class Car {

	String bottle;
	
	public void getBottle() {
		
		System.out.println("Go the car where it's parked unlock it");
		System.out.println("Open car door and find bottle");
		System.out.println("Close the door");
		
	}

	public static void main(String[] args) {
	
		Car myCar = new Car();
		myCar.getBottle();
		
		Car someonesCar = new Car();
		someonesCar.getBottle();
		
		System.out.println("Location of my car : " + myCar);
		System.out.println("Address of someone's car : " + someonesCar);//JVM uses hexadecimal format to create object locations
		
	}
	
}
