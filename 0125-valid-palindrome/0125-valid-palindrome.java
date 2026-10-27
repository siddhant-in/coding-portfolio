class Solution {
    public boolean isPalindrome(String s) {
        String t = s.toLowerCase();
        String temp = "";

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                temp += ch;
            }
        }

        int left = 0;
        int right = temp.length() - 1;

        while (left < right) {
            if (temp.charAt(left) != temp.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}