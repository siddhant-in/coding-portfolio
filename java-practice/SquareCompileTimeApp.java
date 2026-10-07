public class SquareCompileTimeApp {
    public static void square(int i) {
        System.out.println("Square of int number is: " + i * i);
    }

    public static void square(float j) {
        System.out.println("Square of float is: " + j * j);
    }

    public static void main(String[] args) {
        square(5);
        square(5.5f);

    }
}
