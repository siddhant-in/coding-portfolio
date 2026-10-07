//Fibbonaci series
import java.util.*;
public class Fibbonaci
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + ": ");

        for(int i=0; i<=n; i++)
		{
			System.out.print(first+ " ");
			int next=first+second;
			first=second;
			second=next;
		}
		
		
    }
}