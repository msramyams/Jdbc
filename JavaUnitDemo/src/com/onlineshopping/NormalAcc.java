package com.onlineshopping;

public abstract class NormalAcc extends Shop_Acc
{
	private final float deliveryCharges=20;

	public float getDeliveryCharges() 
	{
		return deliveryCharges;
	}

	
	//constructor
	public NormalAcc(int AccNo, String accNm, float charges,float deliveryCharges)
	{
		super(AccNo, accNm, charges);
		deliveryCharges=deliveryCharges;
		
	}
	@Override
	public abstract void bookProduct(float bookproduct);
	
	@Override
	public String toString() 
	{
		return "NormalAcc [deliveryCharges=" + deliveryCharges + ", getaccNo=" + getaccNo() + ", getAccNm="
				+ getAccNm() + ", getCharges=" + getCharges() + "]";
	}
}
