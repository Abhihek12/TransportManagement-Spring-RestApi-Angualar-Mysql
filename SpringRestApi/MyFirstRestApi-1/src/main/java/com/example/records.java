package com.example;

import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonCreator;


@Entity
@Table(name="records")
public class records 
{
	@Id
	private int id; 
	
	@Column(name="dateofload")
	private String dateofload;
	@Column(name="truck")
	private String truck;
	@Column(name="particulars")
	private String particulars;
	@Column(name="rate")
	private String rate;
	@Column(name="weight")
	private int weight;
	@Column(name="amount")
	private int amount;
	@Column(name="khoti")
	private int khoti;
	@Column(name="extra")
	private int extra;
	@Column(name="advance")
	private int advance;
	
	
	
	public int getAdvance() {
		return advance;
	}
	public void setAdvance(int advance) {
		this.advance = advance;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDateofload() {
		return dateofload;
	}
	public void setDateofload(String dateofload) {
		this.dateofload = dateofload;
	}
	public String getTruck() {
		return truck;
	}
	public void setTruck(String truck) {
		this.truck = truck;
	}
	public String getParticulars() {
		return particulars;
	}
	public void setParticulars(String particulars) {
		this.particulars = particulars;
	}
	public String getRate() {
		return rate;
	}
	public void setRate(String rate) {
		this.rate = rate;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getKhoti() {
		return khoti;
	}
	public void setKhoti(int khoti) {
		this.khoti = khoti;
	}
	public int getExtra() {
		return extra;
	}
	public void setExtra(int extra) {
		this.extra = extra;
	}

	
	
	
}
