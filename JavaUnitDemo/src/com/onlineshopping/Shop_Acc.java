package com.onlineshopping;

abstract class Shop_Acc
	{
	//fields
		private int accNo;
		private String accNm;
		private float charges;
		//constructor
		public Shop_Acc(int ANo, String aNm, float ch)
		  {
			  accNo=ANo;
			  accNm=aNm;
			  charges=ch;
		  }
		

		//using getter setter for account no
		public int getaccNo()
		{
			return accNo;
		}
//		public void setAccNo(int accNo)
//		{
//			this.accNo = accNo;
//		}
		//using getter setter for account name
		public String getAccNm() 
		{
			return accNm;
		}
		public void setAccNm(String accNm) 
		{
			this.accNm = accNm;
		}
		//using getter setter for charge
		public float getCharges()
		{
			return charges;
		}
//		public void setCharges(float charges)
//		{
//			this.charges = charges;
//		}

	 abstract void bookProduct(float bookproduct);
	  abstract void items(float items);
	  
	  @Override
	public String toString() {
		return "Shop_Acc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	}
	


