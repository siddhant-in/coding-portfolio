import java.util.*;

class Employee implements Comparable {
	private int id;
	private String name;
	private int sal;

	public Employee() {
	}

	public Employee(String name, int id, int sal) {
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}

	@Override
	public int compareTo(Object o) {
		Employee emp = (Employee) o;
		if (this.id > emp.id) {
			return 1;
		} else if (this.id < emp.id) {
			return -1;
		} else {
			return 0;
		}

	}
}

public class ComparableApp {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		Employee e1 = new Employee("ABC", 3, 10000);
		Employee e2 = new Employee("PQR", 4, 20000);
		Employee e3 = new Employee("STV", 1, 30000);
		Employee e4 = new Employee("XYZ", 2, 5000);
		Employee e5 = new Employee("SSSS", 5, 9000);

		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);

		System.out.println("Display before sorting");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}
		Collections.sort(al);
		System.out.println("Display after sorting");
		for (Object obj : al) {
			Employee e = (Employee) obj;
			System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
		}

	}
}
