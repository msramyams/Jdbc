package com.onlineshopping;

public class EntryPoint
{

	public static void main(String[] args) 
	{
		
		GSShopFactory ShopFactory=new GSShopFactory();
		
		System.out.println("Online Shopping Application");
		System.out.println();
	
		GSPrimeAcc gspa=new GSPrimeAcc(12, "ramya", 20, true);
		System.out.println("Prime accout details:");
		ShopFactory.getNewPrimeAcc(2, "xve", 10, true);
		gspa.bookProduct(45);
		gspa.items(10);
		System.out.println();
		GSNormalAcc gsna=new GSNormalAcc(1234, "ram", 30, 200);
		System.out.println("Normal account details:");
		gsna.bookProduct(20);
		gsna.toString();
	}

}
