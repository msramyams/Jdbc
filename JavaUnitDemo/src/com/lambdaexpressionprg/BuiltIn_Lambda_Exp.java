package com.lambdaexpressionprg;
//java has built in interface such as Consumer interface found in java.util package and is used in list
import java.util.ArrayList;
import java.util.function.Consumer;
public class BuiltIn_Lambda_Exp {

	public static void main(String[] args)
	{
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(20);
		a.add(30);
		a.add(3);
		a.add(89);
		
		//java pre-defined functional interface Consumer
		Consumer<Integer> c=((m)-> {System.out.println(m);}); 	//accepts single arguments and returns no result
		
		a.forEach(c);

	}

}
