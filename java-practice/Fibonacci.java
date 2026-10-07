import java.util.*;
public class Fibonacci
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an upto number: \t");
        int n = sc.nextInt();
        int first=0;
        int second=1, next;

        for(int i=1; i<=n; i++)
        {
            System.out.print(first+" ");
            next=first + second;
            first=second;
            second=next;
        }
        
    }
}