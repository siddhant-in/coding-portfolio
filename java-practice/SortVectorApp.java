import java.util.Iterator;
import java.util.Vector;

public class SortVectorApp {
    public static void main(String[] args) {
        Vector v = new Vector<>();
        v.add(10);
        v.add(640);
        v.add(2);
        v.add(33);
        v.add(98);

        for (int i = 0; i < v.size(); i++) {
            for (int j = (i + 1); j < v.size(); j++) {
                Object prev = v.get(i);
                Object next = v.get(j);

                if ((int) prev > (int) next) {
                    v.set(i, next);
                    v.set(j, prev);
                }
            }
        }
        Iterator i = v.iterator();
        while (i.hasNext()) {
            Object obj = i.next();
            System.out.println(obj + " \t");

        }
    }
}
