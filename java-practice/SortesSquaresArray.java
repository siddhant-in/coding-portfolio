public class SortesSquaresArray {
    public static void main(String[] args) {
        int[] nums = { -4, -1, 0, 3, 10 };
        int[] sortedSquare = sortedSquares(nums);

        for (int num : sortedSquare) {
            System.out.print(num + " ");
        }
    }

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] SortSquare = new int[n];
        
        int left = 0;
        int right = n - 1;
        int index = n - 1;
        
        while (left <= right) {
            int leftSqures = nums[left] * nums[left];
            int rightSqures = nums[right] * nums[right];
            
            if (leftSqures > rightSqures) {
                SortSquare[index] = leftSqures;
                left++;
            } else {
                SortSquare[index] = rightSqures;
                right--;
            }
            index--;
        }
        return SortSquare;
    }
}