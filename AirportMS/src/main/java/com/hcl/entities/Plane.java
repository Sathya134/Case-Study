package com.hcl.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

@Entity
public class Plane {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int planeid;
	@Size(min = 1, message = "Please enter planename")
	private String planename;

	private Integer seats;
	@Size(min = 1, message = "Please enter planetype")
	private String type;

	public Plane() {

	}

	public Plane(Integer planeid, String planename, Integer seats, String type) {
		super();
		this.planeid = planeid;
		this.planename = planename;
		this.seats = seats;
		this.type = type;
	}

	public Integer getPlaneid() {
		return planeid;
	}

	public void setPlaneid(Integer planeid) {
		this.planeid = planeid;
	}

	public String getPlanename() {
		return planename;
	}

	public void setPlanename(String planename) {
		this.planename = planename;
	}

	public Integer getSeats() {
		return seats;
	}

	public void setSeats(Integer seats) {
		this.seats = seats;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
