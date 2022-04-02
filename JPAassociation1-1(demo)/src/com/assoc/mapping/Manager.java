package com.assoc.mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Manager")
public class Manager 
{
	@Id
	@Column(name="Manager_id")
	
	private int mgrId;
	
	@Column(name="Manager_Name")
	private String mgrName;
	
	
	public Manager(int mgrId, String mgrName) 
	{
		super();
		this.mgrId = mgrId;
		this.mgrName = mgrName;
	}
	
	public Manager() 
	{
		super();
		
	}

	public int getMgrId()
	{
		return mgrId;
	}
	public void setMgrId(int mgrId)
	{
		this.mgrId = mgrId;
	}
	public String getMgrName()
	{
		return mgrName;
	}
	public void setMgrName(String mgrName) 
	{
		this.mgrName = mgrName;
	}

	
}
