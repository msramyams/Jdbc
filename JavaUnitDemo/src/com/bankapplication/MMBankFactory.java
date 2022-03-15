package com.bankapplication;

public class MMBankFactory extends BankFactory
{
	public MMSavingAcc getNewSavingAcc(int AccNo, String accNm,float accBal, boolean isSalaried)
	{
		MMSavingAcc msa=null;
				return msa;
	}
	public MMCurrentAcc getNewCurrentAcc(int AccNo, String accNm, float accBal, boolean creditLimit)
	{
		MMCurrentAcc mca=null;
		return mca;
	}

}
