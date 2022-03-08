//program to find missing value
public class FindingMissingNo
{

	public static void main(String[] args)
	{
		int arr[]= {5,3,1,2,7,8,6,9,10};	
		int n=arr.length + 1;
		
		int sum=(n*(n+1))/2;	
		
		for(int i=0;i<arr.length; i++)
		{
			sum=sum - arr[i];
							
			
		}
		System.out.println("Missing value:"+ sum);
	}
	

}
