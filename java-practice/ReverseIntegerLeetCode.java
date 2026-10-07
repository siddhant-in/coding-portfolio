//import java.util.*;

public class ReverseIntegerLeetCode {
    public static void main(String[] args) {

        int result = reverseNum(0123);
        System.out.println(result);
    }

    public static int reverseNum(int x) {
        int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int reverse = 0, sum = 0;
        while (x != 0) {
            reverse = x % 10;
            sum = sum * 10 + reverse;
            x = x / 10;
        }

        return sign * sum;
    }
}