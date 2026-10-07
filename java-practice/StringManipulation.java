import java.util.*;
public class StringManipulation{
    public static void main(String args[]){
        char ch[] = new char[]{'a','b','c','d','e'};
        String str = new String(ch);
        System.out.println(str);

        byte b[] = new byte[]{97,98,99,100,101};
        String s = new String(b);
        System.out.println(s);
    }
}