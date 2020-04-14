package factorymethod.selfLearning;

import java.util.function.Function;
import java.util.function.Supplier;

public class VehicleClient {
public static void main(String[] args) {
	Function<String, Vehicle> funCreateVehicle = VehicleFactory.createVehicle();
	
	//lazy evaluation
	//as before this and after function fetch client can be doing any thing
	funCreateVehicle.apply(Vehicle.CAR_TYPE)
					.honk();
	
	//using supplier
	//still lazy
	Supplier<Vehicle> supplierCreateVehicle = VehicleFactory.createVehicleUsingSupplier(Vehicle.BIKE_TYPE);
	
	//lazy evaluation
	//as before this and after function fetch client can be doing any thing
	supplierCreateVehicle.get()
						 .honk();
}
}
