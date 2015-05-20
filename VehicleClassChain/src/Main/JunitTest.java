package Main;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
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
			
		assertTrue(hashVehicle.size() == 2);	// Size of 2 should be true
		assertTrue(car.getNumberOfDoors() == 4);    //4 door should be true
		assertTrue(truck.getNumberOfAxles() == 2);   // 2 axles should be true
		assertTrue(motorcycle.isHasSideCar() == false);   //no side car should be true
	}

}
