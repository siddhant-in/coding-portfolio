public class PrimeNum
{
public static void main(String [] args)	
    {
	int no=7;
	int temp=0;
	for(int i=2; i<=0; i++)
	{
	    if(no%i==0)
		{
			temp=temp+1;
		}
	}
	if(temp==0)
	{
		System.out.println("Prime");
	}
	else{
		System.out.println("Not Prime");
	}
    }
}