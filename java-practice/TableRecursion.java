import java.util.*;
public class TableRecursion
{
	public static void main(String x[]){
		System.out.println("Table of a given number:");
		
		recTable(1, 5);
	}
	
	static void recTable(int i, int n){
		if(i<=10){
			System.out.println(i*n);
			i++;
			recTable(i, n);
		}
	}
}
