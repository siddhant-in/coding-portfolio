public class Fibbo_Recursion{
    static int fibboSeries(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return (fibboSeries (n-1) + fibboSeries (n - 2)); 
    }

    public static void main(String args[]){
        int i=6;
        System.out.println("Fibbonacci of a number is: ");
        for(int j=0; j<i; j++){
            System.out.print(fibboSeries(j)+" ");
        }
    }
}