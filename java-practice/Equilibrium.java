public class Equilibrium {
    public static void main(String[] args) {
        int[] arr = new int[] { -7, 1, 5, 2, -4, 3, 0 };

        // int total = 0;
        // for (int i = 0; i < arr.length; i++) {
        // total += arr[i];
        // }
        // // System.out.printf("\ntotal "+total);

        // int left_Sum = 0;
        // for (int i = 0; i < arr.length; i++) {
        // int right_Sum = total - arr[i] - left_Sum;
        // if (left_Sum == right_Sum && i != arr.length - 1) {
        // System.out.println("Index at equilibrium " + i);
        // }
        // left_Sum += arr[i];
        // }
        ;
        System.out.println(isEquilibrium(arr));
    }

    public static boolean isEquilibrium(int[] arr) {

        int[] prefixSum = new int[arr.length + 1];
        for (int i = 1; i < arr.length; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i - 1];
        }

        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            if (sum == prefixSum[i]) {
                System.out.println(sum + " " + prefixSum[i]);
                return true;
            }
        }
        return false;
    }
}