//Convert a primitive int value to an Integer object and then convert it back to a primitive. Print all values.
public class InttoInteger{
	public static void main(String [] args){
		int n = 10;
		Integer obj = Integer.valueOf(n);
		
		n = obj.intValue();
		
		System.out.println(n);
	}
}