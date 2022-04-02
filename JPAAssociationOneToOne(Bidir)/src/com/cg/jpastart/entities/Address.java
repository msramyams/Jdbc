package com.cg.jpastart.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
//@Table(name="address")
	public class Address implements Serializable 
	{
		private static final long serialVersionUID=1L;

		@Id
		
		@GeneratedValue(strategy=GenerationType.AUTO)
		@Column(name="address_id")
		private int addressId;
	
		@Column(name="address_street")
		private String street;
	
		@Column(name="address_state")
		private String state;
	
		@Column(name="address_city")
		private String city;
	
		@OneToOne(mappedBy="address")
		private Student student;

	public int getAddressid()
	{
		return addressId;
	}
	public void setAddressid(int addressid)
	{
		this.addressId = addressid;
	}
	public String getStreet() 
	{
		return street;
	}
	public void setStreet(String street) 
	{
		this.street = street;
	}
	public String getState() 
	{
		return state;
	}
	public void setState(String state)
	{
		this.state = state;
	}
	public String getCity() 
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}

	
}
