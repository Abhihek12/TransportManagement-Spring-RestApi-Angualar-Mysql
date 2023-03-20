package com.example;




import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;




@Entity
@JsonDeserialize(as = bill.class)
@Table(name="bill")
public class bill {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int billid;
	
	@Column(name="transportername")
	private String transportername;
	
	@Column(name="date")
	private String date;
	
	@Column(name="Total")
	private String Total;

	public int getBillid() {
		return billid;
	}

	public void setBillid(int billid) {
		this.billid = billid;
	}

	public String getTransportername() {
		return transportername;
	}

	public void setTransportername(String transportername) {
		this.transportername = transportername;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTotal() {
		return Total;
	}

	public void setTotal(String total) {
		Total = total;
	}

	
	
	
	

	

	
	
	
	
}

