class Employee {
    int id;
    String name;
    String deptName;
    double salary;

    static int count = 0;

    Employee() {
        count++;
    }

    Employee(int id, String name, String deptName, double salary) {
        this(); // Call the default constructor to increment the count
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
    }

    static int getObjectCount() {
        return count;
    }

    void display() {
        System.out.println("\nEmployee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + deptName);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "John", "HR", 50000);
        System.out.println("Number of Employees: " + Employee.getObjectCount());
        emp1.display();

        Employee emp2 = new Employee(2, "Jane", "Finance", 60000);
        System.out.println("Number of Employees: " + Employee.getObjectCount());
        emp2.display();

        Employee emp3 = new Employee(3, "Mike", "IT", 70000);
        System.out.println("Number of Employees: " + Employee.getObjectCount());
        emp3.display();
    }
}
