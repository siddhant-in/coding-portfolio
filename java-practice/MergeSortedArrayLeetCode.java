//Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//Output: [1,2,2,3,5,6]
//Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
//The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

public class MergeSortedArrayLeetCode {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        int[] merge = new int[6];
        int left = 0;
        int right = 0;
        for (int i = 0; i < merge.length; i++) {
            if (left < m) {
                merge[i] += nums1[left++];
            } else if (right < n) {
                merge[i] += nums2[right++];
            }
        }
        for (int x : merge) {
            System.out.println(x + " \t");
        }
    }
}