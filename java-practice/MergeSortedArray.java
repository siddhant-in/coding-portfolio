import java.util.*;

class MergeSortedArray {
    private int[] array1, array2, mergedArray;

    // Method to set the input arrays
    public void setArray(int a[], int b[]) {
        this.array1 = a;
        this.array2 = b;
    }

    // Method to merge the two sorted arrays
    public void merge() {
        int n = array1.length, m = array2.length;
        mergedArray = new int[n + m];
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (array1[i] <= array2[j]) {
                mergedArray[k++] = array1[i++];
            } else {
                mergedArray[k++] = array2[j++];
            }
        }

        while (i < n) {
            mergedArray[k++] = array1[i++];
        }

        while (j < m) {
            mergedArray[k++] = array2[j++];
        }
    }

    // Method to return the merged array
    public int[] getMergedArray() {
        return mergedArray;
    }

    // Main method for testing
    public static void main(String[] args) {
        MergeSortedArray obj = new MergeSortedArray();
        int[] a = { 1, 3, 5, 7 };
        int[] b = { 2, 4, 6, 8 };

        obj.setArray(a, b);
        obj.merge();

        for (int num : obj.getMergedArray()) {
            System.out.print(num + " ");
        }
    }
}