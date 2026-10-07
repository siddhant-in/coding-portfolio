// Q2. Write a c program to find sum of all even numbers between 1 to nth numbers.
import java.util.*;
public class SumOfEvenFunction
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a even numbers: ");
		int no=sc.nextInt();
		
		SumOfEven(no);
	}
	
	public static void SumOfEven(int no)
	{
		int sumeven=0;
		for(int i=1; i<=no; i++)
		{
			if(i%2==0)
			{
			  sumeven=sumeven+i;
			}
			
		}
		System.out.println(sumeven+ " is sum of even numbers");
	}
}