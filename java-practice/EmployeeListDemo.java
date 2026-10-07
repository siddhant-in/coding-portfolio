import java.util.LinkedList;

// POJO class for Employee
class Employee {
    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Overriding toString to display employee details
    @Override
    public String toString() {
        return "Employee [ID: " + id + ", Name: " + name + ", Salary: " + salary + "]";
    }
}

public class EmployeeListDemo {
    public static void main(String[] args) {
        LinkedList<Employee> employeeList = new LinkedList<>();

        // Adding employee objects to the list
        employeeList.add(new Employee(101, "Aarav", 55000));
        employeeList.add(new Employee(102, "Meera", 62000));
        employeeList.add(new Employee(103, "Vihaan", 47000));
        employeeList.add(new Employee(104, "Ananya", 58000));
        employeeList.add(new Employee(105, "Dev", 53000));

        // Displaying the employee details
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            System.out.println(emp);
        }
    }
}