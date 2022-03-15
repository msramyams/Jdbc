package com.bankapplication;

public class EntryPoint {

	public static void main(String[] args)
	{
		
		System.out.println("Bank application: ");
		
		System.out.println("Bank account detail:");
	BankAcc ba=new MMSavingAcc(1234,"aff",4000,true);
	ba.setAccNm("asda");
	ba.getAccNm();
		//BankFactory bf=new MMBankFactory();
		//SavingAcc sa=new MMSavingAcc(1234, "xyq", 8000, true);
		//sa.withdraw(200);
		//CurrentAcc ca=new MMCurrentAcc();
		
		MMCurrentAcc mca=new MMCurrentAcc(234, "fgds", 3000, 10000);
		mca.withdraw(2000);
		mca.getAccBal();
		mca.toString();

	}

}
