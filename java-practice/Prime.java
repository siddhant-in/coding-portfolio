import java.util.*;
public class Prime
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		int temp=0;
		for(int no=1; no<=num; no++)
		{
			for(int i=2;i<=no-1; i++)
			{
			  if(no%i==0)
			  {
				temp=temp+1;
			  }
		}
		//int sum=0;
		if(temp==0)
		{
			temp=temp+no;
			System.out.println(temp);
			
		}
		else
		{
			temp=0;
		}
		
	  }
	}
}
		
			