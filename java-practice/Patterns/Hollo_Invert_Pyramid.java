public class Hollo_Invert_Pyramid {
    public static void main(String[] args) {
        int rows = 7, cols = 7;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j == 1) {
                    System.out.print(i + " ");
                } else if (i == 1) {
                    System.out.print(j + " ");
                } else if (j == rows - i + 1) {
                    System.out.print(rows + " ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
