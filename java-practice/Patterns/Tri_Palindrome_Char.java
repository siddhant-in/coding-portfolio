public class Tri_Palindrome_Char {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j <= i) {
                    System.out.print((char) ('A' + j - 1) + " ");
                } else {
                    System.out.print((char) ('A' + 2 * i - j - 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
