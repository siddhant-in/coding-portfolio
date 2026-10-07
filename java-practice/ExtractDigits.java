import java.util.*;
public class ExtractDigits{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string:");
		String str1 = sc.nextLine();
		//String str_2 = sc.nextLine();
		int sum = 0;
		
		for(int i=0; i<str1.length(); i++)
		{
			char ch = str1.charAt(i);
			if(ch >='0' && ch <='9')
			{
				int ascii = (int)ch;
				int num = ascii - 48;
				sum = sum + num;
			}
		}
		System.out.println("Sum of a "+str1+" is: "+sum);
		
	}
}
