import java.util.Scanner;

public class MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Choose one option:");
            System.out.println("1) Calculate volume of cylinder");
            System.out.println("2) Find factorial");
            System.out.println("3) Check Armstrong number");
            System.out.println("4) Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1 -> calculateCylinderVolume(sc);
                case 2 -> findFactorial(sc);
                case 3 -> checkArmstrong(sc);
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice");
            }
        } while (choice != 4);
    }

    public static void calculateCylinderVolume(Scanner sc) {
        System.out.print("Enter radius of cylinder: ");
        double radius = sc.nextDouble();
        System.out.print("Enter height of cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * radius * radius * height;
        System.out.println("Volume of cylinder: " + volume);
    }

    public static void findFactorial(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("Factorial: " + factorial);
    }

    public static void checkArmstrong(Scanner sc) {
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int original = number, result = 0;
        while (original != 0) {
            int digit = original % 10;
            result += Math.pow(digit, 3);
            original /= 10;
        }
        if (result == number) {
            System.out.println(number + " is an Armstrong number");
        } else {
            System.out.println(number + " is not an Armstrong number");
        }
    }
}
