public class Inc_Palindrome_Pyramid {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            int num = 1;
            for (int j = 1; j <= rows + i - 1; j++) {
                if (j <= rows - i) {
                    System.out.print("   ");
                } else if (j <= rows) {
                    System.out.print(num++ + "  ");
                } else {
                    System.out.print(--num - 1 + "  ");
                }
            }
            System.out.println();
        }
    }
}
