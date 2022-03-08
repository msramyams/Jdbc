package com.junitprograms;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

	class HelloWorldTest implements TestLifecycleLogger
	{

		@Test
		@RepeatedTest(10)
		//executes before test and after test
		void test() 
		{
			System.out.println("First Test Case");
		}
	}


