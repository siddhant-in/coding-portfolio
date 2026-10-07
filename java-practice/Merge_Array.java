public class Merge_Array {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 11, 12 };
        int[] arr1 = new int[] { 10, 20, 30, 40 };

        int[] merge = new int[arr.length + arr1.length];

        int a = 0;
        int b = arr1.length - 1;
        int index = 0;

        for (int i = 0; i < merge.length; i++) {
            if (i % 2 == 0 && a < arr.length) {
                merge[index++] = arr[a++];
            } else if (b >= 0) {
                merge[index++] = arr1[b--];
            }
        }

        while (a < arr.length) {
            merge[index++] = arr[a++];
        }
        while (b >= 0) {
            merge[index++] = arr1[b--];
        }

        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
    }

}
