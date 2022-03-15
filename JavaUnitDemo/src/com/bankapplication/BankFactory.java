package com.bankapplication;

public abstract class BankFactory
{
	public  SavingAcc getNewSavingAcc(int AccNo, String accNm, float accBal, boolean isSalaried)
	{
		SavingAcc sa=null;
		
			return sa;
	}
	public CurrentAcc getNewCurrentAcc(int AccNo,String accNm,float accBal,float creditLimit)
	{
		CurrentAcc ca=null;
		
		return ca;
	}

}
