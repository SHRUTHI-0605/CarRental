package com.example.carrental_project.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Car")
public class Car {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	@Column(nullable = false)
	private String model;
	@Column(nullable = false)
	private String lplate;
	@Column(nullable = false)
	private double rate;

	
	
	public Car() {}
	public Car(String model,String lplate,double rate,Long id) {
		this.id=id;
		this.lplate=lplate;
		this.rate=rate;
		this.model=model;
		
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getLplate() {
		return lplate;
	}
	public void setLplate(String lplate) {
		this.lplate = lplate;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
}
