import java.util.*;
public class ReverseArray
{
    public static void main(String x[])
    {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Enter a number: ");
        int arr[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Before alteration");
        System.out.println("================================================");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<arr.length/2; i++)
        {
            arr[i] = arr[i] + arr[(arr.length-1)-i];
            arr[(arr.length-1)-i] = arr[i] - arr[(arr.length-1)-i];
            arr[i] = arr[i] - arr[(arr.length-1)-i];
        }
        System.out.println("\nAfter alteration");
        System.out.println("================================================");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}