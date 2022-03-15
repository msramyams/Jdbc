package com.bankapplication;

public class MMCurrentAcc extends CurrentAcc 
{
	public MMCurrentAcc(int AccNo, String accNm, float accBal, float creditLimit)
	{
		super(AccNo,accNm,accBal,creditLimit);
	}

	@Override
	public void withdraw(float withdraw)
	{
		super.withdraw(withdraw);
	}

	@Override
	public String toString()
	{
		return super.toString();
	}
	
	
	
}
