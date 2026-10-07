public class XOR
{
	public static void main(String args[])
	{
		int a=1, b;
		b=a++ + ++a^--a - a--;
		System.out.printf("%d", b);
	}
}