package com.bankapplication;

public class MMSavingAcc extends SavingAcc
{
	private static final float MINBAL=500;
	
	//constructor
	 MMSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried)
	{
		super(AccNo,accNm,accBal,isSalaried);
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
