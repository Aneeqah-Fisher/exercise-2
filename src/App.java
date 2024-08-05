import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Read and store ten integers from the user
        System.out.println("Enter ten integers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }

        // Output the integers in reverse order
        System.out.println("The integers in reverse order are:");
        for (int i = 9; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        input.close();
    }
}