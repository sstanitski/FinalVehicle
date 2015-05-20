package Main;

public class Motorcycle extends Vehicle implements VehicleInterface{
	private boolean hasSideCar;

	public boolean isHasSideCar() {
		return hasSideCar;
	}

	public void setHasSideCar(boolean hasSideCar) {
		this.hasSideCar = hasSideCar;
	}
	
	
}
