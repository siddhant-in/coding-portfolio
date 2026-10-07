class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long reversed_Num=0;
        long temp=x;
        while(temp != 0){
            int last_Digit =(int) temp % 10;
            reversed_Num =reversed_Num*10+last_Digit;
            temp = temp/10;
        }

        return (reversed_Num==x);
    }
}