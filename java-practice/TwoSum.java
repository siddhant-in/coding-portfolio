public class TwoSum {
    public static void main(String args[]) {
        int arr[] = {2, 7, 11, 15};
        int target = 9;

        for (int i = 1; i < arr.length; i++) {
            if (target - arr[i] == arr[i - 1]) {
                System.out.print(arr[i] + ", " + arr[i - 1]);
            }
        }
    }
}