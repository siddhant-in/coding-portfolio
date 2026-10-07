class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> twoMap = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            int value = target - nums[i];
            if(twoMap.containsKey(value)){
                return new int[]{twoMap.get(value), i};
            }
            twoMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }
}