package com.assertion;
//program to test assertion using assert methods assertEquals(), assertTrue(), assertFalse(), assertNull(), assertNotNull(), assertSame(),assertNotSame(), assertArrayEqual()
import org.junit.Test;
import static org.junit.Assert.*;
public class TestingAssertionMethods
{

	   @Test
	   public void testAssertions() 
	   {
	      //test data
	      String str1 = new String ("abc");
	      String str2 = new String ("abc");
	      String str3 = null;
	      String str4 = "abc";
	      String str5 = "abc";
			
	      int val1 = 5;
	      int val2 = 6;
	      //creating array
	      String[] expectedArray = {"one", "two", "three"};
	      String[] resultArray =  {"one", "two", "three"};

	      //Check that two objects are equal using assertEquals()
	      assertEquals(str1, str2);
	      System.out.println("objects are:"+str1+" and "+str2+" equal");
	      System.out.println("-----------------------------------------");

	      //Check that a condition is true using assertTrue()
	      assertTrue (val1 < val2);
	      System.out.println("true "+val1+" is less than "+val2);
	      System.out.println("-----------------------------------------");

	      //Check that a condition is false using assertFalse()
	      assertFalse(val1 > val2);
	      System.out.println("false "+val1+" is not greater than"+val2);
	      System.out.println("-----------------------------------------");

	      //Check that an object isn't null using assertNotNull()
	      assertNotNull(str1);
	      System.out.println("not null "+ str1);
	      System.out.println("-----------------------------------------");

	      //Check that an object is null using assertNull()
	      assertNull(str3);
	      System.out.println("is null "+str3);
	      System.out.println("-----------------------------------------");

	      //Check if two object references point to the same object using assertSame()
	      assertSame(str4,str5);
	      System.out.println("checks if two object references point to same object ");
	      System.out.println("-----------------------------------------");

	      //Check if two object references not point to the same object using assertNotSame()
	      assertNotSame(str1,str3);
	      System.out.println("checks if two object references not point to same object");
	      System.out.println("-----------------------------------------");

	      //Check whether two arrays are equal to each other using assertArrayEquals.
	      assertArrayEquals(expectedArray, resultArray);
	      System.out.println("expected array: "+expectedArray+" resultArray "+resultArray);
	   }
	}



