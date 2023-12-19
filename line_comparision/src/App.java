import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to line comparision computation");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter start point of line: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter end point of line: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        double length = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2));

        System.out.println("Length of the line is: " + length);

        scanner.close();
    }
}
