import java.util.Scanner;

public class App {
    public static Line getLine(Scanner scanner) {
        System.out.print("Enter start point of line: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.print("Enter end point of line: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        Line line = new Line(x1, y1, x2, y2);

        return line;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to line comparision computation");

        Scanner scanner = new Scanner(System.in);

        System.out.println("For line 1:");
        Line l1 = getLine(scanner);

        System.out.println("Length of line 1: " + l1.length);

        System.out.println("For line 2:");
        Line l2 = getLine(scanner);

        System.out.println("Length of line 2: " + l2.length);

        scanner.close();

        boolean lineEqual = l1.equals(l2);
        System.out.println(lineEqual);
    }
}
