import java.util.*;
public class MaxElement
{
   public static void main(String args[])
   {
	Scanner sc=new Scanner(System.in);
	int n, max=23, min=23;
	System.out.println("Enter an array: ");
	int a[]=new int[5];
	for(int i=0; i<5; i++)
	{
		a[i]=sc.nextInt();
	}
	
	for(int i=0; i<5; i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
			else
			{
				min=a[i];
			}
		}
		System.out.println(max+ " is max elment in array");
		System.out.println(min+ " is min elment in array");
	}
    
 
}
