abstract class Staff {
    protected int id;
    protected String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

class OfficeStaff extends Staff {
    private String department;

    public OfficeStaff(int id, String name, String department) {
        super(id, name);
        this.department = department;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

public class OfficeStaffTest {
    public static void main(String[] args) {
        OfficeStaff[] staffArray = new OfficeStaff[3];
        staffArray[0] = new OfficeStaff(1, "John", "HR");
        staffArray[1] = new OfficeStaff(2, "Alice", "Finance");
        staffArray[2] = new OfficeStaff(3, "Bob", "IT");

        for (OfficeStaff staff : staffArray) {
            staff.displayDetails();
            System.out.println();
        }
    }
}
