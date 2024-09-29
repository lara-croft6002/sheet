
public class MyNumber {
    private int data;

    public MyNumber() {
        this.data = 0;
    }

    public MyNumber(int value) {
        this.data = value;
    }

    public boolean isNegative() {
        return data < 0;
    }

    public boolean isPositive() {
        return data > 0;
    }

    public boolean isZero() {
        return data == 0;
    }

    public boolean isOdd() {
        return data % 2 != 0;
    }

    public boolean isEven() {
        return data % 2 == 0;
    }

    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int value = Integer.parseInt(args[0]);
                MyNumber number = new MyNumber(value);

                System.out.println("Number: " + value);
                System.out.println("Is Negative: " + number.isNegative());
                System.out.println("Is Positive: " + number.isPositive());
                System.out.println("Is Zero: " + number.isZero());
                System.out.println("Is Odd: " + number.isOdd());
                System.out.println("Is Even: " + number.isEven());
            } catch (NumberFormatException e) {
                System.out.println("Please provide a valid integer.");
            }
        } else {
            System.out.println("No arguments provided.");
        }
    }
}
