class P
{
	P(){
		System.out.println("P constructor");
	}
}
class C extends P
{
	C(){
		System.out.println("C constructor");
	}
}
public class PCApp
{
	public static void main(String args[])
	{
		C c1 = new C();
	}
}