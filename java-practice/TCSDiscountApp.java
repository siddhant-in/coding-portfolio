import java.util.*;

public class TCSDiscountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total amount:");
        double bill = sc.nextDouble();

        double discount = 0.0;
        double finalAmnt = 0.0;

        try {
            if (bill < 1000) {
                discount = (bill * 5) / 100;
            } else if (bill <= 5000) {
                discount = (bill * 10) / 100;
            } else {
                discount = (bill * 15) / 100;
            }

                finalAmnt = (double) (bill - discount);

        } catch (Exception e) {
            // TODO: handle exception
        }
        System.out.printf("Final amount: %.2f", finalAmnt);

    }
}
