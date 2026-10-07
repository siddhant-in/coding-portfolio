public class Factorial_Recursion{
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }

        return n * factorial (n-1);
    }

    public static void main(String args[]){
        int i=6;
        System.out.println("Factirial of a number is "+factorial(i));
    }
 }