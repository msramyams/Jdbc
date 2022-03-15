package com.onlineshopping;

public class GSPrimeAcc extends PrimeAcc
{
	private static final float Charges=200;
	
	public float getCharges()
	{
		return Charges;
	}

	
	
	public GSPrimeAcc(int AccNo, String accNm, float charges, boolean isPrime)
	{
		super(AccNo,accNm,charges, isPrime);
		
	}
	


	@Override
	public String toString() {
		return "GSPrimeAcc [Charges=" + Charges + ", toString()=" + super.toString() + "]";
	}
	@Override
	public void bookProduct( float bookproduct)
	{
	System.out.println("No of books ordered:: "+bookproduct);
	}

	@Override
	void items(float items) 
	{
		System.out.println("No of items in cart: "+items);
	
		
	}
	
	

	
}
