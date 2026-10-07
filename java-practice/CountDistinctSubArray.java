import java.util.*;

class CountDistinctSubArray {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 1, 3, 4, 2, 3 };
        int k = 4;

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            // Add current element
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);

            // Remove element going out of window
            if (i >= k) {
                int left = arr[i - k];
                map.put(left, map.get(left) - 1);

                if (map.get(left) == 0) {
                    map.remove(left);
                }
            }

            // When window size = k
            if (i >= k - 1) {
                System.out.print(map.size() + " ");
            }
        }
    }
}