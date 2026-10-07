import java.util.*;
public class Reverse
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		int a[] = {5,3,1,6,7};
		for(int i=0, j=a.length-1; i<a.length/2; i++, j--)
		{
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}
	}
}