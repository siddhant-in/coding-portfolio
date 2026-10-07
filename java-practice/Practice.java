import java.util.*;
public class Practice{
    public static void main(String args[]){
        int z ;
        byte y = 44;
        z = (int) y;
        System.out.println(z);

        //Auto-Boxing
        int a = 10;
        Integer b=a;
        
        System.out.printf("B = %d\n",b);
        
        //Auto-Unboxing
        Integer c = 65;
        int d = c;
        System.out.printf("D = %d\n",d);

        //convert reference value to primitive value
        Double j = 56.7;
        int aa = j.intValue();
        long l = j.longValue();
        short s = j.shortValue();
        System.out.printf("AA = %d,",aa);
        System.out.printf(" L = %d,",l);
        System.out.printf(" S = %d,",s);

        //convert primitive value to reference value
        int k = 85;
        Float f = Float.valueOf(k);
        System.out.println("F = "+f);

        System.out.println();
        System.out.println("Conversion integer to String");
        //Convert integer to String
        Integer w = 100;
        String str = w.toString();
        System.out.println(str);

         System.out.println("Conversion String to primitive datatype");
         //Conversion String to primitive datatype
         String strr = "123456";
         int ab = Integer.parseInt(strr);
         Double dd = Double.parseDouble(strr);
         Long ll = Long.parseLong(strr);
         System.out.println(ab);
         System.out.println(dd);
         System.out.println(ll);

    }
}