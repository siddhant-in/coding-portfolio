public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] productArr = new int[n];

        for (int i = 0; i < n; i++) {
            productArr[i] = 1;
        }

        int left = 1;
        for (int i = 0; i < productArr.length; i++) {
            productArr[i] = productArr[i] * left;
            left = left * nums[i];
        }

        int right = 1;
        for (int i = n - 1; i >= 0; i--) {
            productArr[i] = productArr[i] * right;
            right = right * nums[i];
        }

        return productArr;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 1, 0, -3, 3 };
        int[] result = productExceptSelf(arr);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
