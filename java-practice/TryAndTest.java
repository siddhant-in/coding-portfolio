public class TryAndTest{
	public static void main(String [] args){
		int a=0;
		int b=10;
		int c;
		try{
			c = a / b;
			System.out.println("Division is:  "+c);
		}
		catch(Exception e){
			System.out.println("Exception is:"+e);
		}
	}
}