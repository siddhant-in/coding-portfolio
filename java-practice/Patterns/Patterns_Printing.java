import java.util.*;

public class Patterns_Printing {
    public static void main(String[] args) {
        int number = 5;
        // Number_Triangle(number);
        // Num_Increase_Rev_Pyramid(number);
        // Num_Increasing_Triangle(number);
        // Zero_One_Triangle(number);
        // Palindrome_Triangle(number);
        // Rhombus_Pattern(number);
        // Diamond_Pattern(number);
        butterFly_Pattern(number);
    }

    // Correct logic
    public static void Number_Triangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 0; j <= num - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Correct logic
    public static void Num_Increase_Rev_Pyramid(int num) {
        for (int i = 1; i < num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();

        // for (int i = n; i >= 1; i--) {
        // for (int j = 1; j <= i; j++)
        // System.out.print(j + " ");
        // System.out.println();
        // }
        // System.out.println();
    }

    // Correct logic
    public static void Num_Increasing_Triangle(int num) {
        int count = 1;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(count++ + " ");
            }
            System.out.println();
        }
        System.out.println();

    }

    // Correct logic
    public static void Zero_One_Triangle(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if (count % 2 == 0) {
                    System.out.print("1 ");
                } else {
                    System.out.print("0 ");
                }
                ++count;
            }
            System.out.println();
        }
        System.out.println();

        // OR
        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print((i + j) % 2 + " ");
        // }
        // System.out.println();
        // }
        // System.out.println();
    }

    // Correct logic
    public static void Palindrome_Triangle(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num - i; j++) {
                System.out.print("  ");
            }

            // Print descending numbers
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            // Print ascending numbers starting from 2
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    // correct logic
    public static void Rhombus_Pattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= num; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Correct logic
    public static void Diamond_Pattern(int num) {

        for (int i = 1; i <= num * 2 - 1; i++) {
            // For spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print(" ");
            }
            // Fpr spaces
            for (int j = 1; j <= num; ++j) {
                if (i >= 6 && j <= i - num) {
                    System.out.print(" ");
                }
            }

            for (int j = 1; j <= 5; j++) {
                if (i <= 5 && j <= 5 && j <= i) {
                    System.out.print("* ");
                }
                if (i >= 6 && j <= 10 - i) {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void butterFly_Pattern(int num) {

        int n = num * 2 - 1;
        for (int i = 1; i <= num * 2 - 1; i++) {
            // For spaces
            for (int j = 1; j <= num - i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j <= num; ++j) {
                if (i >= 6 && j <= i - num) {
                    System.out.print("* ");
                }
            }
            System.out.println();

        }
    }

}
