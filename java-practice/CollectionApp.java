import java.util.*;

public class CollectionApp {
	public static void main(String[] args) {
		Vector v = new Vector();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("1: Add Element");
			System.out.println("2: View All  ");
			System.out.println("3: Count number of element ");
			System.out.println("4:Search element by contains method");
			System.out.println("5:Search Element by index");
			System.out.println("6:Delete by using its index");
			System.out.println("7:Fetch elements by using get method");
			System.out.println("8: SubList");
			System.out.println("9: Remove element by value");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch (choice) {
				case 1:
					System.out.println("Enter data in vector");
					int value = xyz.nextInt();
					boolean b = v.add(value);
					if (b) {
						System.out.println("element added");
					} else {
						System.out.println("element not added");
					}
					break;
				case 2:
					Iterator i = v.iterator();
					while (i.hasNext()) {
						Object obj = i.next();
						System.out.println(obj);
					}
					break;
				case 3:
					System.out.println("Number of element in vector " + v.size());
					break;
				case 4:
					System.out.println("Enter value for search ");
					value = xyz.nextInt();
					b = v.contains(value);
					if (b) {
						System.out.println("Value found");
					} else {
						System.out.println("Value not found");
					}
					break;
				case 5:
					System.out.println("Enter value for search ");
					value = xyz.nextInt();
					int index = v.indexOf(value);
					if (index != -1) {
						System.out.println("Data found");
					} else {
						System.out.println("Data not found");
					}
					break;
				case 6:
					System.out.println("Enter value for delete ");
					value = xyz.nextInt();
					index = v.indexOf(value);
					if (index != -1) {
						Object obj = v.remove(index);
						System.out.println("Data Deleted " + obj);

					} else {
						System.out.println("Data not found");
					}
					break;
				case 7:
					for (int k = 0; k < v.size(); k++) {
						Object obj = v.get(k);
						System.out.println(obj);
					}
					break;
				case 8:
					System.out.println("enter start index and end index");
					int startIndex = xyz.nextInt();
					int endIndex = xyz.nextInt();
					if (startIndex >= 0 && endIndex < v.size()) {
						List list = v.subList(startIndex, endIndex);
						for (Object obj : list) {
							System.out.print(obj + "\t");
						}
					}
					break;
				case 9:
					System.out.println("Enter value for delete ");
					value = xyz.nextInt();
					v.remove((Object) value);
					break;
				case 10:
					System.exit(0);
					break;
				default:
					System.out.println("Wrong choice");
			}
		} while (true);
	}
}
