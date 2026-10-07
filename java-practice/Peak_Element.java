// Input: arr = [1, 3, 20, 4, 1, 0]
// Output: Peak element found: 20

public class Peak_Element {

    public static void main(String[] args) {
        int[] arr = new int[] { 1, 3, 20, 4, 1, 0 };
        int peak = getPeak(arr);

        if (peak != -1) {
            System.out.println("Peak element at: " + peak);
        } else {
            System.out.println("Peak element is not found" + peak);
        }

    }

    public static int getPeak(int[] arr) {

        int len = arr.length;

        if (len == 1)
            return arr[0];

        if (arr[0] > arr[1])
            return arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                return arr[i];
            }
        }

        return -1;
    }
}