import java.util.*;
public class DecimaltoBinary
{
    public static void main(String ...x)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int num = sc.nextInt();

        int bin[] = new int[10];
        int index = 0;
        while(num > 0)
        {
            bin[index++] = num % 2;
            num /= 2;
        }
        System.out.print("Binary number is ");
        for(int i=index-1; i>=0; i--)
            System.out.print(bin[i]+" ");
    }
}