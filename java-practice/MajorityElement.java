public class MajorityElement {
    public static void main(String[] args) {

        int[] arr = { 2, 2, 1, 1, 1, 2, 2 };
        int result = majority(arr);
        System.out.println("Majority element is:- " + result);

    }

    public static int majority(int[] arr) {
        int count = 0;
        int candidate = 0;

        for (int x : arr) {
            if (count == 0)
                candidate = x;

            count += (x == candidate) ? 1 : -1;

        }

        return candidate;
    }
}
