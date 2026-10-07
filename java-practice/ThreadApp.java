class A extends Thread
{ public void run()
   { try{
	   for(int i=1; i<=5;i++)
	   {
		   System.out.printf("First = %d\t%b\n",i,isAlive());
		   if(i==3)
		   { stop();
		   }
		 Thread.sleep(10000); //10 wait
	   }
	 }
	 catch(Exception ex)
	 { System.out.println("Error is  "+ex);
	 }
   }
}
class B extends Thread
{ public void run()
   { try{
	   for(int i=1; i<=50;i++)
	   {
	     System.out.printf("Second = %d\n",i);
		 Thread.sleep(1000);  
	   }
	 }
	 catch(Exception ex)
	 { System.out.println("Error is  "+ex);
	 }
   }
}
public class ThreadApp
{
    public static void main(String x[])throws Exception
	{
	   A a1 = new A();
	    a1.start(); //call run() method 
		a1.join();
	System.out.println("Now Status of First thread is "+a1.isAlive());
      B b1 = new B();
	   b1.start();
	}
}
