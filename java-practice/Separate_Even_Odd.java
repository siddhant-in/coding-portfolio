// Input: [1, 2, 3, 4, 5]
// Output: [2, 4, 1, 3, 5]

public class Separate_Even_Odd {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4, 5 };
        int j = 0;

        // First pass: write even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[j++] = arr[i];
            }
        }

        // Second pass: write odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[j++] = arr[i];
            }
        }

        // Print output
        for (int x : arr) {
            System.out.print(x + "\t");
        }
    }
}
