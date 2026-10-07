import java.util.*;
public class Strong
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter last number of series: ");
		int number = sc.nextInt();
		
		for(int n=1; n<=number; n++)
		{
			int sum = 0, rem, temp, fact;
			temp = n;
			
			while(temp != 0)
			{
				rem = temp % 10;
				fact = 1;
				
				for(int i=1; i<=rem; i++)
				{
					fact = fact * i;
				}
				sum = sum + fact;
				temp = temp / 10;
			}
			if(sum == n)
			{
				System.out.println(n+" Strong");
			}
		}
	}
}
			