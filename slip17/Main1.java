interface MarkerInterface {
}

class Product implements MarkerInterface {
   int productId;
   String productName;
   double productCost;
   int productQuantity;

   static int count = 0;

   Product() {
      count++;
   }

   Product(int productId, String productName, double productCost, int productQuantity) {
      this();
      this.productId = productId;
      this.productName = productName;
      this.productCost = productCost;
      this.productQuantity = productQuantity;
   }

   void display() {
      System.out.println("\nProduct ID: " + productId);
      System.out.println("Product Name: " + productName);
      System.out.println("Product Cost: " + productCost);
      System.out.println("Product Quantity: " + productQuantity);
      System.out.println("Object Count: " + getObjectCount());
   }

   static int getObjectCount() {
      return count;
   }
}

public class Main1 {
   public static void main(String[] args) {
      Product p1 = new Product(1, "Laptop", 75000, 5);
      p1.display();

      Product p2 = new Product(2, "Smartphone", 50000, 10);
      p2.display();

      Product p3 = new Product(3, "Tablet", 30000, 7);
      p3.display();
   }
}
