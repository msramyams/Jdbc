import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class DemoOfJUnit 
{
	
	int a=10;
	int b=20;
	int c=a+b;
	
	@Test
	void Display()
	{
		System.out.println("hello");
		System.out.println("addition: "+c);
		
	}
	@Disabled
	@Test
	void display1()
	{
		System.out.println("hello everyone");
	}

}
