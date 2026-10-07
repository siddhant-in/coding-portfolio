class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<Character>();
        if(s.isEmpty()){
            return 0;
        }

        int left = 0, right = 0; 
        int maxWindow = 0;

        while(right < s.length()){
            char ch = s.charAt(right);
            
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }

            set.add(ch);
            right++;

            int currentWindow = right - left;

            if(currentWindow > maxWindow){
                maxWindow = currentWindow;
            }
        }
        return maxWindow;
    }
}