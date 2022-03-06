package com.streamapi;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
public class StreamApiDemo 
{

	public static void main(String[] args) 
	{
		List<Integer> li= Arrays.asList(1,2,3,4,5,6);
		//for(int i=0; i<6;i++)
		//{
		//	System.out.println(li.get(i));
		//}
		
		//Iterator<Integer> iValues =li.iterator();
		//while(iValues.hasNext())
		//{
		//	System.out.println(iValues.next());
		//}
		
		//for(int i: li)
		//{
		//	System.out.println(i);
		//}
		
		li.forEach(new Consumer<Integer>()
		{
		public void accept(Integer i)
		{
			System.out.println(i);
		}
		});
		
		
		

	}

}
