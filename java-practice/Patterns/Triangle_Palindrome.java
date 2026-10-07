public class Triangle_Palindrome {
    public static void main(String[] args) {
        int rows = 6;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= i) {
                    System.out.print(j + " ");
                } else {
                    System.out.print((2 * i - j) + " ");

                }
            }
            System.out.println();
        }
    }
}
