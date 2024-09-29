import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    int bookQty;

    public Book(int bookId, String bookName, double bookPrice, int bookQty) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookQty = bookQty;
    }

    public String toString() {
        return "Book ID: " + bookId + ", Book Name: " + bookName + 
               ", Book Price: " + bookPrice + ", Quantity: " + bookQty;
    }

    public double totalCost() {
        return bookPrice * bookQty;
    }
}

public class BookManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        RandomAccessFile raf;

        try {
            raf = new RandomAccessFile("book.dat", "rw");
            while (true) {
                System.out.println("1. Search for a specific book by name");
                System.out.println("2. Display all books and total cost");
                System.out.println("3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter the book name to search: ");
                        String searchName = scanner.nextLine();
                        searchBookByName(raf, searchName);
                        break;
                    case 2:
                        displayAllBooks(raf);
                        break;
                    case 3:
                        raf.close();
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void searchBookByName(RandomAccessFile raf, String bookName) throws IOException {
        raf.seek(0);
        String line;
        boolean found = false;

        while ((line = raf.readLine()) != null) {
            String[] data = line.split(",");
            if (data[1].trim().equalsIgnoreCase(bookName)) {
                System.out.println("Book found: " + line);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void displayAllBooks(RandomAccessFile raf) throws IOException {
        raf.seek(0);
        String line;
        double totalCost = 0;

        System.out.println("Books in the file:");
        while ((line = raf.readLine()) != null) {
            String[] data = line.split(",");
            Book book = new Book(
                Integer.parseInt(data[0].trim()),
                data[1].trim(),
                Double.parseDouble(data[2].trim()),
                Integer.parseInt(data[3].trim())
            );
            System.out.println(book);
            totalCost += book.totalCost();
        }
        System.out.println("Total Cost of All Books: " + totalCost);
    }
}
