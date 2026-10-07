//3. Write a c program to find sum of all odd numbers between 1 to nth numbers.
import java.util.*;
public class SumOfOddFunction
{
   public static void main(String args[])
   {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter a number:  ");
	 int no = sc.nextInt();
	 
	 SumOfOdd(no);
   }
   
   public static void SumOfOdd (int no)
   {
	   int sumodd=0;
	   for(int i=1; i<=no; i++)
	   {
		   if(i%2!=0)
		   {
			   sumodd=sumodd+i;
		   }
	   }
	   System.out.println(sumodd+" is a sum of odd numbers");
   }
}