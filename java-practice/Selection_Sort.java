public class Selection_Sort {
    public static void main(String[] args) {
        int arr[] = { 6, 5, 2, 8, 9, 4 };
        int len = arr.length;
        int temp = 0;
        int minIndex = -1;

        System.out.println("Before Sorting");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < len - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }
            temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        // System.out.println();
        System.out.println("After Sorting");

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
