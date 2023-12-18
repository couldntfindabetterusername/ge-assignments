import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);

        scanner.close();
    }
}
