package com.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Pilot {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pilotId;
	@Size(min = 1, message = "Please enter firstname")
	private String firstName;
	@Size(min = 1, message = "Please enter lastname")
	private String lastName;
	private int age;
	private int experience;
	@Size(min = 1, message = "Please enter gender")
	private String gender;

	public Pilot() {

	}

	public Pilot(int pilotId, String firstName, String lastName, int age, int experience, String gender) {
		super();
		this.pilotId = pilotId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.experience = experience;
		this.gender = gender;
	}

	public int getPilotId() {
		return pilotId;
	}

	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
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

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
