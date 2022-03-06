
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
public class Assumption
{
	//@Test
	//public void assumeTrueTest()
	{
		//Assumptions.assumeTrue(true);
		System.out.println("execute if assumption is true");
		System.out.println("assumption is kind of if condition, it it is true continue else abort");
		
	}
	//@Test
	//public void assumeFalseTest()
	{
		Assumptions.assumeFalse(false);
		
		System.out.println("will evaluate given assumption and test will run if result is false");
		
	}
	//@Test
	//public void assumeFalseTest()
	{
		//Assumptions.assumeFalse(true);
		
		System.out.println("skips the test");
		
	}
	
	@Test
	public void testAssumingThat()
	{
		System.setProperty("env", "test");
		Assumptions.assumingThat("test".equals(System.getProperty("env")), () ->{
			Assertions.assertEquals(20, 20);
			System.out.println("test env code");
			System.out.println("if condition is true then executes else do not abort test continue rest of code in test");
		});
		Assertions.assertEquals(200,200);
	}
}