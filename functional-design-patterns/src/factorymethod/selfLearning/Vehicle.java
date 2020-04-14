package factorymethod.selfLearning;

public interface Vehicle {
	String CAR_TYPE = "car";
	String BIKE_TYPE = "bike";
	String TRUCK_TYPE = "truck";
	
	void honk();
	
}

class Car implements Vehicle{
	public Car() {
		System.out.println("Car instance created");
	}
	@Override
	public void honk() {
		System.out.println("vehicle making honk sound");
	}
	
}

class Bike implements Vehicle{
	public Bike() {
		System.out.println("Bike instance created");
	}
	@Override
	public void honk() {
		System.out.println("Bike making honk sound");
	}
	
}

class Truck implements Vehicle{
	public Truck() {
		System.out.println("Truck instance created");
	}
	@Override
	public void honk() {
		System.out.println("Truck making honk sound");
	}
	
}