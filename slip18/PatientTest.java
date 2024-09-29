import java.util.Scanner;

class CovidException extends Exception {
    public CovidException(String message) {
        super(message);
    }
}

class Patient {
    String patient_name;
    int patient_age;
    int patient_oxy_level;
    int patient_HRCT_report;

    public Patient(String patient_name, int patient_age, int patient_oxy_level, int patient_HRCT_report) {
        this.patient_name = patient_name;
        this.patient_age = patient_age;
        this.patient_oxy_level = patient_oxy_level;
        this.patient_HRCT_report = patient_HRCT_report;
    }

    public void checkForCovid() throws CovidException {
        if (patient_oxy_level < 95 && patient_HRCT_report > 10) {
            throw new CovidException("Patient is Covid Positive(+) and Needs to be Hospitalized");
        }
        displayInfo();
    }

    public void displayInfo() {
        System.out.println("Patient Name: " + patient_name);
        System.out.println("Patient Age: " + patient_age);
        System.out.println("Patient Oxygen Level: " + patient_oxy_level);
        System.out.println("Patient HRCT Report: " + patient_HRCT_report);
    }
}

public class PatientTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter patient name: ");
        String name = sc.next();
        System.out.print("Enter patient age: ");
        int age = sc.nextInt();
        System.out.print("Enter patient oxygen level: ");
        int oxyLevel = sc.nextInt();
        System.out.print("Enter patient HRCT report: ");
        int hrct = sc.nextInt();

        Patient patient = new Patient(name, age, oxyLevel, hrct);
        try {
            patient.checkForCovid();
        } catch (CovidException e) {
            System.out.println(e.getMessage());
        }
    }
}
