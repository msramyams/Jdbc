package com.bankapplication;

public abstract class CurrentAcc extends BankAcc
{
	private final float creditLimit=5000;
	
	//constructor
	public CurrentAcc(int AccNo, String accNm, float accBal, float creditLimit)
	{
		super(AccNo, accNm,accBal);
		creditLimit=creditLimit;
	}
	//methods
	@Override
	public void withdraw(float withdraw)
	{
		if(withdraw>creditLimit)
		{
			System.out.println("cannot withdraw , exceeded credit Limit");
		}
		else
		{
			System.out.println("amount withdrawed: "+withdraw);
		}
	}
	@Override
	public String toString()
	{
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
}
