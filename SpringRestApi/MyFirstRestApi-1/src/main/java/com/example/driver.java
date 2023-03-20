package com.example;

import java.time.LocalDate;

import javax.persistence.*;

@Entity
@Table(name="driver ")
public class driver 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="drivername")
	private String drivername;
	
	@Column(name="vehicalno")
	private String vehicalno;
	
	@Column(name="dateofjoining")
	private String dateofjoining;
	
	@Column(name="dateofleaving")
	private String dateofleaving;
	
	@Column(name="advance")
	private int advance;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDrivername() {
		return drivername;
	}

	public void setDrivername(String drivername) {
		this.drivername = drivername;
	}

	public String getVehicalno() {
		return vehicalno;
	}

	public void setVehicalno(String vehicalno) {
		this.vehicalno = vehicalno;
	}

	public String getDateofjoining() {
		return dateofjoining;
	}

	public void setDateofjoining(String dateofjoining) {
		this.dateofjoining = dateofjoining;
	}

	public String getDateofleaving() {
		return dateofleaving;
	}

	public void setDateofleaving(String dateofleaving) {
		this.dateofleaving = dateofleaving;
	}

	public int getAdvance() {
		return advance;
	}

	public void setAdvance(int advance) {
		this.advance = advance;
	}

	
	

}	
