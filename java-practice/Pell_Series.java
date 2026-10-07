import java.util.*;
public class Pell_Series{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int c, a=1, b=0;
        System.out.println("Enter last number");
        int l=sc.nextInt();
        for(int i=1; i<=l; i++){
            c = a + 2 * b;
            System.out.println("C is      "+c);
            System.out.println();
            System.out.println();
System.out.println("A is    "+a);
            System.out.println("B is    "+b);
            a = b;
            b = c;
        }
    }
}