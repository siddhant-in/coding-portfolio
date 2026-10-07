// public class Palindrome_Pyramid {
//     public static void main(String[] args) {
//         int num = 5;
//         for (int i = 1; i <= num; i++) {
//             int k = i;
//             for (int j = 1; j <= num + i - 1; j++) {
//                 if (j < 6) {
//                     if (i + j >= 6) {
//                         System.out.print(k++ + "  ");
//                     } else {
//                         System.out.print("   ");
//                     }
//                 } else if (j >= 6 && j <= 4 + i) {
//                     System.out.print(--k - 1 + "  ");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }

public class Palindrome_Pyramid {
    public static void main(String[] args) {

        int rows = 7;

        for (int i = 1; i <= rows; i++) {

            int num = i;

            for (int j = 1; j <= rows + i - 1; j++) {

                if (j <= rows - i) {
                    // spaces
                    System.out.print("   ");
                }
                else if (j <= rows) {
                    // increasing numbers
                    System.out.print(num++ + "  ");
                }
                else {
                    // decreasing numbers
                    System.out.print(--num - 1 + "  ");
                }
            }
            System.out.println();
        }
    }
}
