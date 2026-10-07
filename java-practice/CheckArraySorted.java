public class CheckArraySorted {
    public static void main(String[] args) {
        // int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int[] arr = new int[] { 1, 2, 10, 54 };

        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int arr[]) {

        int n = arr.length;
        for (int i = 0; i < n - 1; ++i) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;

    }
}
