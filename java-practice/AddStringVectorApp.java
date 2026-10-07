import java.util.Iterator;
import java.util.Vector;
import java.util.*;

public class AddStringVectorApp {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("Very");
        v.add("Good");
        v.add("Morning");

        String str = "";

        Iterator i = v.iterator();
        while (i.hasNext()) {
            Object o = i.next();
            str = str + " " + (String) o;
        }
        System.out.println("String is:" + str);
    }
}
