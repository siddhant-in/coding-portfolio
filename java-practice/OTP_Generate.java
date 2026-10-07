import java.util.*;

public class OTP_Generate {

    public static void main(String[] args) {
        Random random = new Random();

        String OTP = "";

        for (int i = 1; i <= 6; i++) {
            int digit = random.nextInt(10);
            OTP = OTP + digit;
        }

        System.out.println("OTP " + OTP);
    }
}
