/*public class NumbersWithEvenDigits {

    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896, 963852, 5667 };

    
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(isEvenDigit(arr[i]) == 1){
                count++;
            }
        }
        System.out.println(count);
    }
    
    public static int isEvenDigit(int num){
        int count =0;

        while (num>0) {
            count++;
            num = num / 10;
        }

        if(count % 2 == 0){
            return 1;
        }

        return 0;
    }
}
    */

public class NumbersWithEvenDigits {
    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896, 963852, 5667 };

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEvenDigit(arr[i]) == 1) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static int isEvenDigit(int num) {
        int count = 0;

        while (num > 0) {
            count++;
            num = num / 10;
        }

        if (count % 2 == 0) {
            return 1;
        }

        return 0;
    }
}