public int findKthLargest(int[] nums, int k) {
    int length = nums.length;

    // Sorting array in descending order
    // temp is temporary variable used for sorting an array.
    for (int i = 0; i < length; i++) {
        for (int j = i + 1; j < length; j++) {
            if (nums[i] < nums[j]) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
    }

    for (int i = 0; i < length; i++) {
        if (k == i + 1) {
            return nums[i];
        }
    }
    return -1;
}
