import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int c = scanner.nextInt();

        int largest = Math.max(Math.max(a, b), c);

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}
