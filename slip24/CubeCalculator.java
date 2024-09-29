import java.util.function.Function;

public class CubeCalculator {
    public static void main(String[] args) {
        Function<Integer, Integer> cubeFunction = number -> number * number * number;

        int number = 5; // You can change this number as needed
        int cube = cubeFunction.apply(number);

        System.out.println("The cube of " + number + " is: " + cube);
    }
}
