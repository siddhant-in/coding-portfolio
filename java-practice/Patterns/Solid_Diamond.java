public class Solid_Diamond {
    public static void main(String[] args) {
        // solidDiamond();
        // hollowSolidDiamond();
        // hollowDiamondInscribedRectangle();
        solidHalfDiamond();
    }

    static void solidDiamond() {
        int rows = 10, cols = 9;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i <= 6) {
                    if (j >= 6 - i && j <= 4 + i) {
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                } else if (i - j <= 5 && i + j <= 15) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void hollowSolidDiamond() {
        int rows = 10, cols = 9;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (j == 4 + i || j + i == 6 || i - j == 5 || i + j == 15) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    static void hollowDiamondInscribedRectangle() {
        int rows = 10, cols = 9;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i < 6) {
                    if (j > 6 - i && j < 4 + i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                } else if (i - j < 5 && i + j < 15) {
                    System.out.print("  ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    static void solidHalfDiamond() {
        int cols = 4;
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= cols; j++) {
                if(i<=cols){
                    if(j<=i){
                        System.out.print("* ");
                    }
                }else if(i+j<=8){
                   System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                
            }
            System.out.println();
        }
    }

    

}