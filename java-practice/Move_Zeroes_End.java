public class Move_Zeroes_End {
    public static void main(String[] args) {
        int[] arr = new int[] { 0, 2, 6, 4, 0, 5, 0, 0, 98 };
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < arr.length) {
            arr[index++] = 0;
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
