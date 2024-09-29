import java.util.Scanner;

public class NameFormat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String first = sc.next();
        System.out.println("Enter middle name: ");
        String middle = sc.next();
        System.out.println("Enter last name: ");
        String last = sc.next();

        middle = middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();
        
        System.out.println(last + ", " + first + " " + middle);
    }
}
