import java.util.*;

public class RotateArrayByK {
    public static void main(String[] args) {

        System.out.println("Enter a Kth value   :- ");
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
        rotateArray(arr, k);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    public static void reverseArray(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void rotateArray(int[] arr, int k) {
        k = k % arr.length;

        reverseArray(arr, 0, arr.length - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, arr.length - 1);
    }
}
