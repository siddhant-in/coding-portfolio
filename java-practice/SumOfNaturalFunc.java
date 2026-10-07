// 1. 1. Write a c program to find sum of all natural numbers between 1 to nth numbers.
import java.util.*;
public class SumOfNaturalFunc
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a natural number:");
		int no=sc.nextInt();
		
		System.out.println("Sum of natural number is :");
		SumOfNatural(no);
	}
	
	public static void SumOfNatural(int no)
	{
		int sum=0;
		for(int i=1; i<=no; i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		
	}	
}