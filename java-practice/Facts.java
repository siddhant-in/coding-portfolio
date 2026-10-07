import java.util.*;
public class Facts
{
	public static void main(String x[])	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a no.");
	int n=sc.nextInt();
	System.out.println("Factorial is:");
		
	getFact(n);
}

	public static int getFact(int n)	{
	
	int factorial=1;
	for(int i=n; i>=1; i--)
	{
		factorial=factorial*i;

	}
	System.out.println(factorial);
	return 1;
}
}