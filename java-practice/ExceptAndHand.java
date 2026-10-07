import java.util.*;

public class  ExceptAndHand{

	public static void main(String[] args) {
		Scanner xyz = new Scanner(System.in);
		try {
			System.out.println("Enter two values");
			int a = xyz.nextInt();
			int b = xyz.nextInt();
			int c = a / b;
			System.out.println("Division is " + c);
		} catch (Exception ex) {
			System.out.println("Error is " + ex);
		} finally {
			System.out.println("I can execute always ");
		}
	}
}
