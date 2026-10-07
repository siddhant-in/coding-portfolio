// Output: [1, 40, 2, 30, 3, 20, 4, 10, 5]

public class MergeArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        int[] arr1 = new int[] { 10, 20, 30, 40 };

        int[] mergedArray = new int[arr.length + arr1.length];

        int i = 0;
        int j = arr1.length - 1;
        int index = 0;

        while (i < arr.length && j >= 0) {
            mergedArray[index++] = arr[i++];
            mergedArray[index++] = arr1[j--];

        }

        while (i < arr.length) {
            mergedArray[index++] = arr[i++];
        }

        while (j >= 0) {
            mergedArray[index++] = arr1[j--];
        }

        for (int k = 0; k < mergedArray.length; k++) {
            System.out.print(mergedArray[k] + " ");
        }
    }
}
