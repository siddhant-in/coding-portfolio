public class HousesWithMostfoodRequired {

    public static void main(String[] args) {

        int[] arr = { 2, 8, 3, 5, 7, 4, 1, 2 };
        int r = 7, unit = 2;
        System.out.println(houseCount(r, unit, arr));
    }

    public static int houseCount(int rats, int unit, int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        int foodRequired = rats * unit;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];

            if (sum >= foodRequired) {
                return i + 1;
            }

        }
        return 0;

    }
}
