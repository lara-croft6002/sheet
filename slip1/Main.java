import java.util.Scanner;


abstract class Order {
    int id;
    String description;
    abstract void accept();
    abstract void display();
}

class PurchaseOrder extends Order {
    String customerName;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Purchase Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Purchase Order description: ");
        description = scanner.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = scanner.nextLine();
    }

    void display() {
        System.out.println("\nPurchase Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

class SalesOrder extends Order {
    String vendorName;

    void accept() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Sales Order description: ");
        description = scanner.nextLine();

        System.out.print("Enter Vendor Name: ");
        vendorName = scanner.nextLine();
    }

    void display() {
        System.out.println("\nSales Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class Main {
    public static void main(String[] args) {
        PurchaseOrder po1 = new PurchaseOrder();
        PurchaseOrder po2 = new PurchaseOrder();
        PurchaseOrder po3 = new PurchaseOrder();

        System.out.println("Enter details for Purchase Orders:");
        po1.accept();
        po2.accept();
        po3.accept();

        SalesOrder so1 = new SalesOrder();
        SalesOrder so2 = new SalesOrder();
        SalesOrder so3 = new SalesOrder();

        System.out.println("\nEnter details for Sales Orders:");
        so1.accept();
        so2.accept();
        so3.accept();

        System.out.println("\nDetails of Purchase Orders:");
        po1.display();
        po2.display();
        po3.display();

        System.out.println("\nDetails of Sales Orders:");
        so1.display();
        so2.display();
        so3.display();
    }
}
