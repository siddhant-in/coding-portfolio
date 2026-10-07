public class Num_Hollow_Pyramid {
    public static void main(String[] args) {

        int rows = 7;
        int cols = 13;

        for (int i = 1; i <= rows; i++) {
            int num = 1;

            for (int j = 1; j <= cols; j++) {

                // left diagonal
                if (j == rows - i + 1) {
                    System.out.print(num + " ");
                }
                else if (i == rows && j % 2 == 1) {
                    System.out.print(num++ + " ");
                }
                else if (j == rows + i - 1) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
