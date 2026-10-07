import java.util.*;

public class EvenCubeseries {
    public static void main(String x[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an upto number: \t\n");
        int n = sc.nextInt();
        System.out.print("Enter a cube number: \t");
        // int even=sc.nextInt();
        int c = sc.nextInt();
        int eveSum = 0;

        for (int i = 1; i <= n; i++) {
            eveSum = eveSum + 2;
            int cube = c * c * c;
            System.out.print(eveSum + "  " + cube + "  ");
            c--;
        }

    }
}