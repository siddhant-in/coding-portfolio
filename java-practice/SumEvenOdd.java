import java.util.*;
public class SumEvenOdd
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int sum=0, sumodd=0;;
	 int a[]=new int[6];
	 System.out.println("Enter an array: ");
	 
	 for(int i=0; i<6; i++)
	 {
		a[i]=sc.nextInt();
	  }
	  
	  for(int i=0; i<6; i++)
	  {
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
			else
			{
				sumodd=sumodd+a[i];
			} 
	   }
		System.out.println(sum+ " is sum of even elment in array");
		System.out.println(sumodd+ " is sum of odd elment in array");
	}
}