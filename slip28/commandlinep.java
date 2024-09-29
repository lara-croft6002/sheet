public class commandlinep {

    static void display(int numbers[]) {
        for (int i = 0; i < 5; i++) {
            System.out.print(numbers[i] + "\t");
        }
    }

    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(args[i]);
        }
        System.out.println("Before Sorting:");
        display(numbers);
        System.out.println("After Sorting :");
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                if (numbers[i] > numbers[j]) {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        display(numbers);
    }
}
