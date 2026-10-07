
//Q7. Write a java program to find Armstrong number from array.
import java.util.*;

public class Armstrong {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        System.out.println("The ArmStrong number upto the limt:");
        for (int num = 1; num <= number; num++) {
            int rem, sum = 0;
            int digit = 0;

            int temp = num;
            while (temp != 0) {
                temp = temp / 10;
                digit++;
            }

            temp = num;
            while (temp != 0) {
                rem = temp % 10;
                int product = 1;
                for (int i = 1; i <= digit; i++) {
                    product = product * rem;
                }

                sum = sum + product;
                temp /= 10;
                if (sum == num) {
                    System.out.println(num);
                }
            }
        }
    }
}