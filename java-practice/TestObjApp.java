import java.util.*;
class Employee{
	private int id;
	public Employee() {
		
	}
	public Employee(int id,String name) {
		this.id=id;
		this.name=name;
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
	private String name;
	
	public boolean equals(Object obj) {
		Employee e=(Employee)obj;
		if(this.id==e.id && this.name.equals(e.name)) {
			return true;
		}
		else {
			return false;
		}
	}
	public int hashCode() {
		return id*10000;
	}
}
public class TestObjApp {
	public static void main(String[] args) {
		LinkedHashSet<Employee> hs = new LinkedHashSet<Employee>();
		Employee emp1 = new Employee(1,"ABC");
		Employee emp2 = new Employee(2,"MNO");
		Employee emp3 = new Employee(3,"PQR");
		Employee emp4= new Employee(1,"ABC");
		Employee emp5 = new Employee(2,"MNO");
		Employee emp6 = new Employee(3,"PQR");
		
		hs.add(emp1);
		hs.add(emp2);
		hs.add(emp3);
		hs.add(emp4);
		hs.add(emp5);
		hs.add(emp6);
		for(Employee e:hs) {
			System.out.println(e.getId()+"\t"+e.getName()+"\t"+System.identityHashCode(e));
		}
	}
}
