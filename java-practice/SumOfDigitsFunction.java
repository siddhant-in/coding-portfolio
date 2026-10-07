//4. Write a c program to calculate sum of digits of a number. 
import java.util.*;
public class SumOfDigitsFunction
{
   public static void main(String args[])
   {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int no = sc.nextInt();
		
		SumOfDigits(no);
   }
   
   public static void SumOfDigits(int no)
   {
	   int sum=0;
	   
	   int i=1;
	   while(i<=no)
	   {
		   int rem=no%10;
		   sum=sum+rem;
		   no=no/10;
		}
		i++;
	   
	   System.out.println(sum+" is sum of digits");
   }
}