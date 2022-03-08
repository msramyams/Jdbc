package com.junitprograms;
import org.junit.jupiter.api.RepeatedTest;

	public class RepeatingTest 
	{

		@RepeatedTest(50)
		//executes 50 times
		void test()
		{
			System.out.println("First Test Case .....");
		}

	}

