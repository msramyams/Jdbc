package com.lambdaexpressionprg;
//lambda expression work with only functional interface which consist of 1 interface method
//single method interface
interface StringFunction
{
	public String beforeformatting(String str);	//only 1 method in interface is known as functional interface
}
public class LambdaExp_In_Method
{
	//to use lambda expression in method, it should have parameter with single method interface as its type
	public static void printFormatted(String str, StringFunction sf)
	{
		//calling interface method will run lambda expression
		String result= sf.beforeformatting(str);
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		StringFunction quest = (q)-> q + "?";	//single parameter lambda
		StringFunction exclaim= (e)-> e + "!";
		
		//calling method and passing parameters
		printFormatted("how are you", quest);
		printFormatted("are you alright", exclaim);

	}

}

