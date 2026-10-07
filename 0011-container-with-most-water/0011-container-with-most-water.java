class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while(left < right){
            int minHeight = 0;
            if(height[left] < height[right]){
                minHeight = height[left];
            }else{
                minHeight = height[right];
            }

            int width = right - left;
            int product = minHeight * width;
            if(maxArea < product){
                maxArea = product;
            }

           if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }

        }
        return maxArea;
    }
}