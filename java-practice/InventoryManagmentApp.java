import java.util.*;

public class Product {
  private int id;
  private String name;
  private int price;
  private int qty;

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }

  public int getQty() {
    return qty;
  }

}

// Employee.java
public class Employee {
  private int id;
  private String name;
  private int sal;
  private int presentDay;

  public void setId(int id) {
    this.id = id;
  }

  public int getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setSal(int sal) {
    this.sal = sal;
  }

  public int getSal() {
    return sal;
  }

  public void setPresentDay(int presentDay) {
    this.presentDay = presentDay;
  }

  public int getPresentDay() {
    return presentDay;
  }
}

// Shop.java
public class Shop {
  private Product[] products;
  private Employee[] employees;

  public void setProducts(Product products[]) {
    this.products = products;
  }

  public Product[] getProducts() {
    return products;
  }

  public void setEmployees(Employee employees[]) {
    this.employees = employees;
  }

  public Employee[] getEmployees() {
    return employees;
  }

  public Employee[] getEmployeeRecordWithBonusSalary() {
    for (int i = 0; i < employees.length; i++) {
      int presenty = employees[i].getPresentDay();
      if (presenty >= 30) {
        int empCurrSal = employees[i].getSal();
        int bonusSal = empCurrSal * 10 / 100;
        empCurrSal = empCurrSal + bonusSal;
        employees[i].setSal(empCurrSal);
      }
    }
    return employees;
  }

  public Product[] getBillWithDiscount() {
    for (Product p1 : products) {
      int qty = p1.getQty();
      int rate = p1.getPrice();
      int total = qty * rate;
      if (total > 500) {
        int discount = total * 20 / 100; // 120/1
        total = total - discount; // 600-120

      }
      // p1.setTotal(total);
    }
    return products;
  }
}

// Owner.java
public class Owner {
  private Shop shop;

  public void setShop(Shop shop) {
    this.shop = shop;
  }

  public Shop getShop() {
    return shop;
  }

  public void showEmployees() {
    Employee employees[] = shop.getEmployees();
    for (int i = 0; i < employees.length; i++) {
      System.out.println(employees[i].getId() + "\t" + employees[i].getName() + "\t" +
          employees[i].getSal() + "\t" + employees[i].getPresentDay());
    }
  }

  public void showProducts() {
    Product products[] = shop.getProducts();
    for (Product p : products) // for(int i=0;i<products.length;i++)
    {
      System.out.println(p.getId() + "\t" + p.getName() + "\t" + p.getPrice() + "\t" + p.getQty());
    }
  }

  public void creditSal() {
    Employee emp[] = shop.getEmployeeRecordWithBonusSalary();
    for (Employee e : emp) {
      System.out.println(e.getId() + "\t" + e.getName() + "\t" + e.getSal());
    }
  }

  public void showProdDetailsWithDiscount() {
    Product p[] = shop.getBillWithDiscount();
    for (Product p1 : p) {
      System.out.println(p1.getId() + "\t" + p1.getName() + "\t" + p1.getQty() + "\t" + p1.getPrice() + "\t" +
          (p1.getQty() * p1.getPrice()) + "\t" + p1.getTotal());
    }

  }
}

// InventoryManagmentApp.java

public class InventoryManagmentApp {
  public static void main(String x[]) {
    Scanner xyz = new Scanner(System.in);

    Owner o1 = new Owner();

    Shop s1 = new Shop();

    Employee e[] = new Employee[3]; // array of reference.
    for (int i = 0; i < e.length; i++) {
      e[i] = new Employee(); // array of objects
      System.out.println("Enter name id and salary as well as number of present days");
      String name = xyz.nextLine();
      int id = xyz.nextInt();
      int sal = xyz.nextInt();
      int presentDay = xyz.nextInt();
      e[i].setName(name);
      e[i].setId(id);
      e[i].setSal(sal);
      e[i].setPresentDay(presentDay);
      xyz.nextLine();
    }
    Product p1[] = new Product[3]; // array of reference
    for (int i = 0; i < p1.length; i++) {
      p1[i] = new Product(); // array of object
      System.out.println("Enter name id price and quantity");
      String name = xyz.nextLine();
      int id = xyz.nextInt();
      int price = xyz.nextInt();
      int qty = xyz.nextInt();
      p1[i].setName(name);
      p1[i].setId(id);
      p1[i].setQty(qty);
      p1[i].setPrice(price);
      xyz.nextLine();
    }

    s1.setEmployees(e);// base address
    s1.setProducts(p1); // base address

    o1.setShop(s1);
    System.out.println("Display EmployeeList");
    o1.showEmployees();
    System.out.println("==========================");
    System.out.println("Display Product List");
    o1.showProducts();
    System.out.println("Show Employee Record with Bonus Salary");
    o1.creditSal();
    System.out.println("Show products bill with discount amount");
    o1.showProdDetailsWithDiscount();
  }
}
