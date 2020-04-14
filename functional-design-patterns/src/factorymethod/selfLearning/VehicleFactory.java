package factorymethod.selfLearning;

import java.util.function.Function;
import java.util.function.Supplier;

public class VehicleFactory {

	public static Function<String, Vehicle> createVehicle() {
		//we can do things lazily
		//we can pass function
		//client can call apply and then only if client really needs we create object
		return (type) -> {
			Vehicle vehicle = null;
			switch (type) {
			case Vehicle.CAR_TYPE:
				vehicle = new Car();
				break;
			case Vehicle.BIKE_TYPE:
				vehicle = new Bike();
				break;
			case Vehicle.TRUCK_TYPE:
				vehicle = new Truck();
				break;	
			default:
				break;
			}
			return vehicle;
		};
		
	}
	
	public static Supplier<Vehicle> createVehicleUsingSupplier(String type) {
		//we can do things lazily
		//we can pass function
		//client can call apply and then only if client really needs we create object
		return () -> {
			Vehicle vehicle = null;
			switch (type) {
			case Vehicle.CAR_TYPE:
				vehicle = new Car();
				break;
			case Vehicle.BIKE_TYPE:
				vehicle = new Bike();
				break;
			case Vehicle.TRUCK_TYPE:
				vehicle = new Truck();
				break;	
			default:
				break;
			}
			return vehicle;
		};
		
	}
}
