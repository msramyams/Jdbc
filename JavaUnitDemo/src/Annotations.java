//Annotation for Junit testing using @Test,@BeforeClass, @Before, @After, @AfterClass,@Disabled method and @Disabled class, @Tag, @DisplayName

import org.junit.Test;	//package to import Test
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;


public class Annotations
{
	@Test
	public void display1()
	{
		System.out.println("@Test- specifies method is test method");
		System.out.println("-------------------------------");
	}
	
	@Test(timeout=1000)
	public void testTimeOut()
	{
		System.out.println("@TestTimeOut- specifies that method will fail if it takes longer than spicified time");
		System.out.println("--------------------------------------------------------");
	}
	
	@BeforeClass	//need to import package org.junit.BeforeClass 
	public static void beforeClass()	//method should be static
	{
		System.out.println("@BeforeClass- specifies that method will be invoked only once before starting all test");
		System.out.println("Welcome to annotations");
		System.out.println("----------------------");
	}
	
	@Before			//need to import package org.junit.Before
	public void before()
	{
		System.out.println("@Before specifies that method will invoke before every test");
		System.out.println("----------------------------------------------------------");
	}
	
	@After		//need to import package
	public void after()
	{
		System.out.println("@After specifies that method will invoke after every test");
		System.out.println("---------------------------------------------------------");
	}
	@Test
	@Tag(value="Ramya")
	public  void tag()
	{
		System.out.println("@tag is used to tag a method such as smoke, regression");
	}
	@AfterClass
	public static void AfterClass()	//method should be static
	{
		System.out.println("@AfterClass specifies that method will invoked only once after finishing all test");
		System.out.println(" i have learned @Test,@Test(timeout=1000), @Before,@BeforeClass, @After, @AfterClass");
	}
	@Test
	@DisplayName(value="Important")
	public void displayname()
	{
		System.out.println("@DisplayName-we can display custom display names for test class or test method");
	}
	
	@Disabled
	public void disabled()
	{
		System.out.println("@Disabled is used to disabled the method ");
	}
	
	
	//Disabled test class
	@Disabled
	class DisabledDemo
	{
		@Test
		public void message()
		{
			System.out.println("Entire test classes or individual test methods may be disabled");
		}
	}
	
	
}