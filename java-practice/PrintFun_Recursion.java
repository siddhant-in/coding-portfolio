public class PrintFun_Recursion{
    static void printFun(int n){
        if(n < 1){
            return;
        }
        else{
            System.out.print(n+" ");
            printFun(n-1);
            System.out.print(" "+n);
            return;
        }
    }

    public static void main(String []args){
        int num = 3;
        printFun(num);
    }
}