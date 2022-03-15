package com.onlineshopping;

abstract class PrimeAcc extends Shop_Acc 
{
	private boolean isPrime;
	private static final  float deliveryCharges=10;
	
	//using getters and setters for isPrime
	public boolean getisPrime()
	{
		return isPrime;
	}

//	public void setPrime(boolean isPrime)
//	{
//		this.isPrime = isPrime;
//	}
	
	//using getter and setter for deliverycharges
	public float getdeliveryCharges()
	{
		return deliveryCharges;
	}
	
	//constructor

	public PrimeAcc(int AccNo, String accNm, float charges, boolean isPrime)
	{
		super(AccNo, accNm, charges);
		isPrime=isPrime;
		
	}
	
	
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getaccNo=" + getaccNo() + ", getAccNm=" + getAccNm()
				+ ", getCharges=" + getCharges() + "]";
	}
	@Override
	public abstract void bookProduct(float bookproduct);
	
	
}
