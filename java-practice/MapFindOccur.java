import java.util.*;

public class MapFindOccur {
    public static void main(String[] args) {
        Scanner xyz = new Scanner(System.in);
        LinkedHashMap map = new LinkedHashMap();
        int a[] = new int[10];
        System.out.println("Enter values in array");
        for (int i = 0; i < a.length; i++) {
            a[i] = xyz.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            // Integer count=(Integer)map.get(a[i]);
            Object obj = map.get(a[i]);
            Integer count = (Integer) obj;
            if (count == null) {
                count = new Integer(0);
            }
            ++count;
            map.put(a[i], count);
        }
        System.out.println("Display occurence of every element");
        Set<Map.Entry> entrySet = map.entrySet();
        for (Map.Entry m : entrySet) {
            System.out.println(m.getKey() + "\t" + m.getValue());
        }
    }
}
