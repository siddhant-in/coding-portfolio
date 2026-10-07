import java.util.*;
public class CalcPower
{
	public static void main(String x[])	{
	int p, b, index;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a val");
	 b=sc.nextInt();
	 index=sc.nextInt();

	System.out.println("Power is:");
	
	getPower(b, index);
}

	public static int getPower(int b, int index)	{
	
	int p=1;
	for(int i=index; i>=1; i--)
	{
		p=p*b;

	}
	System.out.println(p);
	return 1;
}
}