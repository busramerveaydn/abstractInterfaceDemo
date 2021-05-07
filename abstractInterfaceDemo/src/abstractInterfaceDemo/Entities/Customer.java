package abstractInterfaceDemo.Entities;


import java.time.LocalDate;

import abstractInterfaceDemo.Abstract.Entity;

public class Customer implements Entity{
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalID;
	
	public Customer() {
		
	}

	public Customer( String firstName, String lastName, LocalDate dateOfBirth, String nationalID) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalID = nationalID;
	}

	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getNationalID() {
		return nationalID;
	}

	public void setNationalID(String nationalID) {
		this.nationalID = nationalID;
	}
}
