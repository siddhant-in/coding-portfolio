import java.util.*;

public class ArrayListOp {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		do {
			Scanner xyz = new Scanner(System.in);
			System.out.println("1:Add New Element");
			System.out.println("2:View All Elements");
			System.out.println("3:Search Element Using indexOf()");
			System.out.println("4:Search Element Using get()");
			System.out.println("5:Delete Element By Index");
			System.out.println("6:Check Size");
			System.out.println("7:Check Empty or Not");
			System.out.println("Enter your choice");
			int choice = xyz.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter element to add");
				xyz.nextLine();
				String ele = xyz.nextLine();
				al.add(ele);
				break;
			case 2:
				Iterator i = al.iterator();
				while(i.hasNext()){
				Object obj = i.next();
				System.out.println(obj);
}
				break;
			case 3:
				System.out.println("Enter element to search");
				xyz.nextLine();
				String search = xyz.nextLine();
				System.out.println("Index:"+al.indexOf(search));
				break;
			case 4:
				System.out.println("Enter index to get");
				int index = xyz.nextInt();
				System.out.println("Element:"+al.get(index));
				break;
			case 5:
				System.out.println("Enter index to delete");
				int delIndex = xyz.nextInt();
				al.remove(delIndex);
				System.out.println("Element removed");
				break;
			case 6:
				System.out.println("Size:"+al.size());
				break;
			case 7:
				System.out.println("Is empty:"+al.isEmpty());
				break;
			default:
				System.out.println("Wrong choice");
			}
		} while(true);
	}
}