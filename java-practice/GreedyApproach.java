import java.util.Arrays;
public class GreedyApproach{
    static int minValue(int a[], int amount){
       int len = a.length;
       int sum = 0;
       Arrays.sort(a);

       for(int i=len-1; i>=0; i--){

        if(amount > a[i]){
            int count = amount / a[i];

            sum += count;

            amount -= (a[i] * count);

        }
        if(amount == 0)
            break;
       }
       return sum;
    }
    public static void main(String args[]){
        int arr[] = {88, 2, 10, 1};
        int amount = 39;

        System.out.println(minValue(arr, amount));
    }
}