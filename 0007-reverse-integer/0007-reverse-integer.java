class Solution {
    public int reverse(int x) {
       int sign = x < 0 ? -1 : 1;
        x = Math.abs(x);
        int reverse = 0, sum = 0;
        while (x != 0) {
            reverse = x % 10;

            if(sum > Integer.MAX_VALUE / 10){
                return 0;
            }

            if(sum < Integer.MIN_VALUE / 10){
                return 0;
            }


            sum = sum * 10 + reverse;
            x = x / 10;
        }

        return sign * sum;
    }
}