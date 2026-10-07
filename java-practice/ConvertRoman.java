/*	Q3. WAP to create class name as ConvertDecimalToRoman 
ConvertDecimalToRoman(int decimal): this constructor can accept decimal number 
Void showRoman(): this function can convert a decimal number to roman and display it.
*/
import java.util.*;
class ConvertDecimalToRoman
{
	
	int decimal; 
	int value[]={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	String roman[]={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	ConvertDecimalToRoman(int d)
	{
		decimal = d;
	}
	
	void showRoman()
	{
		while(decimal != 0)
		{
			for(int i=0; i<13; i++)
			{
				if(decimal >= value[i])
				{
					System.out.print(roman[i]);
					decimal = decimal - value[i];
					break;
				}
			}
		}
	}
}
public class ConvertRoman
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a decimal number : \t");
		int dec = sc.nextInt();
		ConvertDecimalToRoman cdr = new ConvertDecimalToRoman(dec);
		
		System.out.println("Roman number of given decimal is: ");
		cdr.showRoman();
	}
}