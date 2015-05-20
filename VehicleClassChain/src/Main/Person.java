package Main;

import java.util.UUID;

public class Person {
	private String firstName;
	private String lastName;
	private UUID personID;
	
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public UUID getPersonID() {
		return personID;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setPersonID(UUID personID) {
		this.personID = UUID.randomUUID();
	}
	
	

}
