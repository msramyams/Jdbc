
class Thread1 extends Thread
{
	public void run()
	{
		int count = 0;
		while(count< 50)
		{
			System.out.println(count);
			count++;
		}

		}
	}
class Thread2 extends Thread
{
	public void run()
	{
		int count1=0;
		while(count1< 50)
		{
			System.out.println(count1);
			count1++;
		}
		
	}
}
public class March8_ThreadPrg extends Thread
{
	public static void main(String[] args)
	{
		Thread1 th1=new Thread1();	//creating thread
		Thread2 th2=new Thread2();
		
		th1.start();//starting thread
		th2.start();
		

	}

}
