// 2. Write a program to check whether an array is palindrome or not
import java.util.*;
public class ArrayPailndrone
{
   public static void main(String args[])
   {
     Scanner sc=new Scanner(System.in);
	 int n;
	 System.out.println("Enter an array size: ");
	 n=sc.nextInt();
	 System.out.println("Enter an array: ");
	 int a[]=new int[n];
	 for(int i=0; i<n; i++)
	 {
		a[i]=sc.nextInt();
	  }
	  
	 int i=0, j=n-1;
	  
	 if(a[i]==a[j])
		{
			System.out.println("Array is a Pailndrone");
			i++;
			j--;
		}
	
	 else{
			System.out.println("Array is not Pailndrone");
		 }	
    }
}	