import java.util.*;
public class Except{
    public static void main(String [] args){
        int a, b, c;
        a = 9;
        b = 0;

        try{
            // c = a/b;
            // System.out.println("Result is "+c);
            String s = "1234 ";
            int z = Integer.parseInt(s);
            System.out.println(a);
        }
        catch(Exception ex){
            System.out.println("Error is "+ex);
            // System.out.println("Logic 1");
            // System.out.println("Logic 2");
            // System.out.println("Logic 3");
        }
    }
}