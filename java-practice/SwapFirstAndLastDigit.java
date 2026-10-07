import java.util.*;

public class SwapFirstAndLastDigit {
    public static void main(String x[]) {
        // Scanner xyz = new Scanner(System.in);
        int no, temp, count = 0, p, p1, first, last;
        // System.out.println("Enter number");
        // no = xyz.nextInt();
        no = 1234;

        temp = no;
        System.out.printf("\nBefore swapping first and last digit %d\n", no);
        while (no != 0) {
            no = no / 10;
            ++count;
        }
        no = temp;
        last = no % 10;
        p = ((int) Math.pow((double) 10, (double) (--count)));
        first = no / p;
        no = no / 10;
        p1 = ((int) Math.pow((double) 10, (double) (--count)));
        no = no % p1;
        last = last * p;
        no = no * 10;
        no = last + no + first;
        System.out.printf("\nAfter swapping first and last digit %d\n", no);
    }
}