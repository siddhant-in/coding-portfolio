public class CountOfWords {
    public static void main(String[] args) {

        // int n = 145;
        // for (int i = 0; i <=n; i++) {
        // if(strongNumber(i)){
        // System.out.println(i);
        // }
        // }

        String s = "aaabccdddd";
        String str = "";
        int count = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                // sb.append(s.charAt(i)).append(count);
                str = str + s.charAt(i) + count;
                count = 1;
            }
        }
        System.out.println(str);
    }

    // public static boolean strongNumber(int number) {
    // int temp = number;
    // int sum = 0;

    // if(number > 0 && number <= 2) return true;

    // while (temp != 0) {
    // int rem = temp % 10;
    // // for (int i = 1; i <= rem; i++) {
    // // fact *= i;
    // // }
    // sum = sum + factorial(rem);
    // temp /= 10;

    // }

    // return sum == number;

    // }

    // public static int factorial(int n){
    // int fact = 1;
    // for (int i = 1; i <= n; i++) {
    // fact = fact * i;
    // }
    // return fact;
    // }

}
