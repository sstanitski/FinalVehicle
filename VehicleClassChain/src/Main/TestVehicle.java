package Main;

import java.util.HashMap;
import java.util.UUID;

public class TestVehicle {
	public static void main(String[] args) {
	Person a = new Person();
	
	Car car = new Car();
	car.transferOwnership(a);
	car.setNumberOfDoors(4);
	
	Truck truck = new Truck();
	truck.transferOwnership(a);
	truck.setNumberOfAxles(2);
	
	Person b = new Person();
	truck.transferOwnership(b);
	
	Motorcycle motorcycle = new Motorcycle();
	motorcycle.setHasSideCar(false);
	
	HashMap<UUID, Vehicle> hashVehicle =  new HashMap<UUID, Vehicle>();
	hashVehicle.put(a.getPersonID(), car);
	hashVehicle.put(b.getPersonID(), truck);
	
	}
}
