import java.util.Arrays;
import java.util.Scanner;

class Student {
    int roll_no;
    String name;
    double percentage;

    public Student(int roll_no, String name, double percentage) {
        this.roll_no = roll_no;
        this.name = name;
        this.percentage = percentage;
    }

    public static void sortStudent(Student[] students) {
        Arrays.sort(students, (s1, s2) -> Double.compare(s2.percentage, s1.percentage));
    }

    public void display() {
        System.out.println("Roll No: " + roll_no + ", Name: " + name + ", Percentage: " + percentage);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1));
            System.out.print("Roll No: ");
            int roll_no = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Percentage: ");
            double percentage = sc.nextDouble();

            students[i] = new Student(roll_no, name, percentage);
        }

        Student.sortStudent(students);

        System.out.println("Students sorted by percentage:");
        for (Student student : students) {
            student.display();
        }

        sc.close();
    }
}
