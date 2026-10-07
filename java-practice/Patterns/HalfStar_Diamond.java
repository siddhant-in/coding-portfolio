public class HalfStar_Diamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 4; j++) {
                if (i <= 4 && j <= i) {
                    System.out.print(i + "* ");
                } else if (i <= 8 - j && i >= 5) {
                    System.out.print(8 - i + "* ");
                }
            }
            System.out.println();
        }
    }
}
