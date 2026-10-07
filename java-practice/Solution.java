class Solution {
    public int[] plusOne(int[] digits) {
  
        for (int i = digits.length - 1; i >= 0; i--) {

            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }

            digits[i] = 0;
        }
        
		//for the [9, 9, 9]
        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1
        int[] digits1 = {1, 2, 3};
        int[] result1 = solution.plusOne(digits1);
        System.out.print("Result 1: ");
        for (int digit : result1) {
            System.out.print(digit + " ");
        }
        System.out.println(); // New line

        // Example 2
        int[] digits2 = {9, 9, 9};
        int[] result2 = solution.plusOne(digits2);
        System.out.print("Result 2: ");
        for (int digit : result2) {
            System.out.print(digit + " ");
        }
        System.out.println(); // New line
    }
}
