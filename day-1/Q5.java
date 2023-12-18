import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number <= 1) {
            System.out.println("Please enter a number greater than 1.");
            scanner.close();

            return;
        }

        System.out.println("Prime factors of " + number + " are:");
        printPrimeFactors(number);

        scanner.close();
    }

    private static void printPrimeFactors(int number) {
        for (int i = 2; i * i <= number; i++) {
            while (number % i == 0) {
                System.out.print(i + " ");
                number /= i;
            }
        }

        if (number > 1) {
            System.out.print(number);
        }
    }
}
