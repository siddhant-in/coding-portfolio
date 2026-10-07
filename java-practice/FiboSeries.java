import java.util.*;

public class FiboSeries 
{
    public static void main(String[] args) 
     {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();

        int first = 0, second = 1;
        System.out.print("Fibonacci Series up to " + n + ": ");

        for (int i = 1; i <= n; i++) 
	{
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}
