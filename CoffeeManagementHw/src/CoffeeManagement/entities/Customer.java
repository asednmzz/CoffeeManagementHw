package CoffeeManagement.entities;

import java.time.LocalDate;


import CoffeeManagement.abstracts.IEntity;

public class Customer implements IEntity{

	
	private int id;
	private String firstName;
	private String lastName;
	private LocalDate dateOfBirth;
	private String nationalityIdentity;
	
	public Customer() {}
	public Customer(LocalDate dateOfBirth, String firstName, String lastName,  String nationalityIdentity, int id) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nationalityIdentity = nationalityIdentity;
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public LocalDate setDateOfBirth(LocalDate dateOfBirth) {
		return  dateOfBirth;
	}

	public String getNationalityIdentity() {
		return nationalityIdentity;
	}

	public void setNationalityIdentity(String nationalityIdentity) {
		this.nationalityIdentity = nationalityIdentity;
	}
	public void setDateOfBirth(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
}
