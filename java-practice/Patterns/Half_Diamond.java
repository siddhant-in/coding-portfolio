public class Half_Diamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if (j <= i && i <= 4) {
                    System.out.print(i + 2 + " ");
                } else if (i >= 5 && i <= 8 - j) {
                    System.out.print(8 - i+2 + " ");
                }
            }
            System.out.println();
        }
    }
}
