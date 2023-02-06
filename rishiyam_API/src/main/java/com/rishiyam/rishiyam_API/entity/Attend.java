package com.rishiyam.rishiyam_API.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Attend {
    @Id
	private int id;
	private String name;
	private String city;
	private Boolean status;

	public Attend(int id, String name, String city, Boolean status) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Attend() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Attend [id=" + id + ", name=" + name + ", city=" + city + ", status=" + status + "]";
	}
}
