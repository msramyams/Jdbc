package com.bankapplication;

public abstract class SavingAcc extends BankAcc
{
	//fields
	private boolean isSalaried;
	private static final float MINBAL=500;
	
	//using getter and setter
	public boolean isSalaried()
	{
		return isSalaried;
	}
	public void setSalaried(boolean isSalaried) 
	{
		this.isSalaried = isSalaried;
	}

	public static float getMinbal()
	{
		return MINBAL;
	}

	//constructor
	public SavingAcc(int AccNo, String accNm, float accBal,boolean isSalaried)
	{
		super(AccNo,accNm, accBal);
		this.isSalaried=isSalaried;
	}
	
	//methods
	@Override
	public void  withdraw(float withdraw)
	{
		this.withdraw(withdraw);
		if(withdraw<=MINBAL)
		{
			System.out.println("cannot withdraw due to low balance");
		}
		else
		{
			System.out.println("Money withdrawed: "+withdraw);
		}
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + "]";
	}
}
