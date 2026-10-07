import java.util.*;
public class StrongNum
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a limit number : ");
        int num = sc.nextInt();
        Facto f = new Facto(num);

    }

    public static int Facto(int number)
  {
    int num;
        for(int n=1; n<=num; n++)
        {
            int temp = n;
            int sum=0;

            while(temp > 0)
            {
                int rem = temp % 10;
                int fact = 1;
                
                for(int j=1; j<=rem; j++)
                {
                    fact = fact * j;
                }
                sum += fact;
                temp /= 10;
            }
                if(sum==n)
                {
                  return n;
                }
        }
    }
}