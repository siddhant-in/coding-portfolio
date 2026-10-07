import java.util.*;
public class PerfectNoArray
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size: ");
		int n = sc.nextInt();
		int a[] = new int[n];
	
		System.out.println("Enter the elements: ");
		for(int i =0; i<n; i++)
		{
			a[i] =sc.nextInt();
		}
		
		System.out.println("Perfect number in array: ");
		int sum=0;			
		for(int i =1; i<a.length; i++)
		{
			for(int j=1; j<a[i]; j++)
			{
				if(a[i] % j == 0) {
					sum += j;
				}
			}
			System.out.println(a[i]);
			if(sum==a[i]){
			System.out.println(a[i]);	
			}
		}
	}
}