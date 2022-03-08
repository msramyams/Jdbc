package com.junitprograms;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

	class DisabledClassDemo
	{
	    @Test
	      void testWillBeSkipped()
	    {
	    System.out.println("this test class is not disabled...");
	    }
	    
	    @Disabled
	    //will not test
	    @Test
	    public void testWillBeDisabled() 
	    {
	    	System.out.println("This test is disabled...");
	    }
	}


