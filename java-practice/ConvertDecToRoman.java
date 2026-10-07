import java.util.*;
public class ConvertDecToRoman
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        int num = sc.nextInt();

        String roman[]={"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int value[]={1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        while(num != 0)
        {
            for(int i=0; i<roman.length; i++)
            {
                if( num >= value[i])
                {
                    //System.out.println(num);
                    System.out.print(roman[i]);
                    //System.out.println(value[i]);
                    num = num - value[i];
                    break;

                }
            }
        }
    }
}