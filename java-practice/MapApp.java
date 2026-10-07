import java.util.*;

public class MapApp {
    public static void main(String[] args) {
        LinkedHashMap map = new LinkedHashMap<>();
        Scanner sc = new Scanner(System.in);
        // map.put(1, "abc");
        // map.put(2, "lmn");
        // map.put(3, "xyz");

        // Set<Map.Entry> es = map.entrySet();
        // for (Map.Entry e : es) {
        // System.out.println(e.getKey() + "\t" + e.getValue());
        // }

        int a[] = new int[4];
        for (int i = 0; i < a.length; ++i) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            Object obj = map.get(a[i]);
            System.out.println("Object value is: --->" + map.get(a[i]));
            Integer count = (Integer) obj;
            if (count == null) {
                count = new Integer(0);
            }
            ++count;
            map.put(a[i], count);
        }
        System.out.println("Duplicate elements are: ");
        Set<Map.Entry> set = map.entrySet();
        for (Map.Entry entry : set) {
            if ((Integer) entry.getValue() > 1) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
        }
    }

}
