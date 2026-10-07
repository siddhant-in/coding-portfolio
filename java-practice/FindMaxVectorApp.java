import java.util.Vector;

public class FindMaxVectorApp {

    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(10);
        v.add(640);
        v.add(2);
        v.add(33);
        v.add(98);

        Object max = v.get(0);
        for (int i = 1; i < v.size(); i++) {
            if ((int) v.get(i) > (int) max) {
                max = v.get(i);
            }
        }
        System.out.println("Max element is: " + max);
    }
}