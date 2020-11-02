package com.hcl.entities;

import javax.persistence.Entity;

import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;

@Entity
public class Admin {
	@Id
	private int id;
	@Size(min = 1, message = "Please enter firstname")
	private String firstName;
	@Length(min = 3, max = 10, message = "minimum length is 3 to 5 characters")
	private String lastName;
	private int age;
	@Size(min = 1, message = "Please enter gender")
	private String gender;
	private long contactNumber;
	private int vendorId;
	@Size(min = 1, message = "Password Required")
	private String password;

	public Admin() {
	}

	public Admin(int id, String firstName, String lastName, int age, String gender, long contactNumber, int vendorId,
			String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.vendorId = vendorId;
		this.password = password;
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}