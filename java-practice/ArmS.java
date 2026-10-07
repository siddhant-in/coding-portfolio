import java.util.*;
public class ArmS
{
	public static void main(String args[])		{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter no.");
	int no=sc.nextInt();
	int t1=no;
	int len=0;
	while(t1!=0)	{
		t1=t1/10;
		len=len+1;
	}

	int t2=no;
	int arm=0;

	while(t2!=0){
		int prod=1;
		int rem=t2%10;
		for(int i=1; i<=len; i++)
		{
		prod=prod*rem;
		}
		arm=arm+prod;
		t2=t2/10;
	}
	if(arm==no)
	{
	System.out.println(no+ "is is arm");
	}
	else{
	System.out.println(no+ "is not arm");
	}
}
}