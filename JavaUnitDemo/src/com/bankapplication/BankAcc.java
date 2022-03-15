package com.bankapplication;

public abstract class BankAcc
{
	//fields
	private int accNo;
	private String accNm;
	private float accBal;
	
	public int getAccNo()
	{
		return accNo;
	}

	public String getAccNm() 
	{
		return accNm;
	}

	public void setAccNm(String accNm) 
	{
		this.accNm = accNm;
	}

	public float getAccBal()
	{
		return accBal;
	}

	
	//constructor
	public BankAcc()
	{
	}
	public BankAcc(int AccNo,String accNm, float accBal)
	{
		accNo=AccNo;
		this.accNm=accNm;
		this.accBal=accBal;
	}
	
	//methods
	public void withdraw(float withdraw)
	{
		withdraw=2000;
	}
	public void deposite(float deposite)
	{
		deposite=1000;
	}
	@Override
	public String toString()
	{
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
}
