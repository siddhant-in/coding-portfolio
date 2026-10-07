//Convert a double primitive value into a Double object using both autoboxing and the valueOf() method.
public class DoubleToAuto{
	public static void main(String [] args){
		double n = 10.548;
		Double dd = n;	//Autoboxing
		Double d = Double.valueOf(n);
		n = d.doubleValue();
		System.out.println(n);
		System.out.println(dd);
	}
}