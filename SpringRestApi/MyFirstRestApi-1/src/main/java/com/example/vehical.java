package com.example;

import javax.persistence.*;


@Entity
@Table(name="vehical ")
public class vehical {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="vehicalno")
	private String vehicalno;
	
	@Column(name="tax")
	private String tax;
	@Column(name="fitness")
	private String fitness;
	@Column(name="insurance")
	private String insurance;
	@Column(name="puc")
	String puc;
	@Column(name="permit")
	private String permit;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicalno() {
		return vehicalno;
	}
	public void setVehicalno(String vehicalno) {
		this.vehicalno = vehicalno;
	}
	public String getTax() {
		return tax;
	}
	public void setTax(String tax) {
		this.tax = tax;
	}
	public String getFitness() {
		return fitness;
	}
	public void setFitness(String fitness) {
		this.fitness = fitness;
	}
	public String getInsurance() {
		return insurance;
	}
	public void setInsurance(String insurance) {
		this.insurance = insurance;
	}
	public String getPuc() {
		return puc;
	}
	public void setPuc(String puc) {
		this.puc = puc;
	}
	public String getPermit() {
		return permit;
	}
	public void setPermit(String permit) {
		this.permit = permit;
	}
	
	
	

}
