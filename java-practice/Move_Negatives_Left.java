public class Move_Negatives_Left {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, -1, 0, -4, 5 };

        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }

        for (int k = 0; k < arr.length; k++)
            System.out.print(arr[k] + "\t");
    }
}
