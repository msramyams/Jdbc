// lifecycle method  is driven by 4 primary annotations  @BeforeAll, @BeforeEach, @AfterEach and @AfterAll.
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;


public class LifeCycleMethod 
{
	//each method must be marked @Test annotation
	@Test
	@BeforeAll
	public void beforeAll()
	{
		System.out.println("@BeforeAll signals that annotated method should execute before all test in current class");
	}
	@Test
	public void message()
	{
		System.out.println("lifecycle method");
	}
	
	@Test
	@BeforeEach
	public void beforeEach()
	{
		System.out.println("@BeforeEach specifies that method should execute before each test");
	}
	
	@Test
	@AfterEach
	public void afterEach()
	{
		System.out.println("@AfterEach specifies that method should execute after each test in current class");
	}
	
	@Test
	@AfterAll
	public void afterAll()
	{
		System.out.println("@AfterAll signals that annotated method should execute after all test in current class");
	}
}
