import java.util.*;

public class TestVectorApp {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector v = new Vector();
        do {
            System.out.println("1: Add Element");
            System.out.println("2: View All  ");
            System.out.println("3: Count number of element ");
            System.out.println("4:Search element by contains method");
            System.out.println("5:Search Element by index");
            System.out.println("6:Delete by using its index");
            System.out.println("7:Fetch elements by using get method");
            System.out.println("8: SubList");
            System.out.println("9: Remove element by value");

            System.out.println("Enter a choice");
            int choice = sc.nextInt();
            System.out.println();
            System.out.println();

            switch (choice) {
                case 1:
                    System.out.println("Enter an element");
                    int element = sc.nextInt();
                    boolean isEleAdded = v.add(element);
                    if (isEleAdded) {
                        System.out.println("Element added");
                    } else {
                        System.out.println("Element not added");
                    }
                    break;

                case 2:
                    Iterator i = v.iterator();
                    while (i.hasNext()) {
                        Object o = i.next();
                        System.out.println(o);
                    }
                    break;
                case 3:
                    System.out.println("Total values present: " + v.size());
                    break;
                case 4:
                    System.out.println("Enter an element to be searched");
                    element = sc.nextInt();
                    boolean isElePresent = v.contains(element);
                    if (isElePresent) {
                        System.out.println("Value is present");
                    } else
                        System.out.println("Value is not present");
                    break;
                case 5:
                    System.out.println("Enter element to be searched by index");
                    element = sc.nextInt();
                    int index = v.indexOf(element);
                    if (index != -1) {
                        System.out.println("Value is present at an index: " + index);
                    } else
                        System.out.println("Value is not present");
                    break;
                case 6:
                    System.out.println("Enter element to be delete");
                    element = sc.nextInt();
                    index = v.indexOf(element);
                    if (index != -1) {
                        v.remove(index);
                        System.out.println("Element " + element + " removed at index: " + index);
                    } else
                        System.out.println("Value is not present");

                    break;
                case 7:
                    System.out.println("List of elements");
                    for (int k = 0; k < v.size(); k++) {
                        System.out.println(v.get(k));
                    }

                    break;
                case 8:
                    System.out.println("Enter a start and end index of sublist");
                    int s = sc.nextInt();
                    int e = sc.nextInt();
                    if (s >= 0 && e < v.size()) {
                        List list = v.subList(s, e);
                        for (Object obj : list) {
                            System.out.println(obj + " \t");
                        }
                    }
                    break;
                case 9:
                    System.out.println("Enter a element to be removed");
                    element = sc.nextInt();
                    isElePresent = v.remove(element);
                    if (isElePresent) {
                        System.out.println("Element removed");
                    } else {
                        System.out.println("Element not found");
                    }
                    break;
                case 10:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Wrong choice...!");
                    break;
            }

        } while (true);
    }
}
