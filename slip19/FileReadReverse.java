import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadReverse {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));
            StringBuilder originalContent = new StringBuilder();
            String line;

            while ((line = br.readLine()) != null) {
                originalContent.append(line).append("\n");
            }

            br.close();

            System.out.println("Original Content in Upper Case:");
            System.out.println(originalContent.toString().toUpperCase());

            System.out.println("Content in Reverse Order:");
            System.out.println(originalContent.reverse());
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
