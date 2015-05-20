package Main;

public abstract class Vehicle implements VehicleInterface{
	private String name;
	private String color;
	private int weight;
	private Person owner;
	
	public void transferOwnership(Person newOwner){
		this.owner = newOwner;
	}
	
	public String getName() {
		return name;
	}
	public String getColor() {
		return color;
	}
	public int getWeight() {
		return weight;
	}
	public Person getOwner() {
		return owner;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void setOwner(Person owner) {
		this.owner = owner;
	}
	

	

}
