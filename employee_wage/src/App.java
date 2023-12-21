
import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to employee wage builder");

        Company company = new Company();

        int option;

        do {
            System.out.println("--------------------------");
            System.out.println("Enter 1 to build company");
            System.out.println("Enter 2 to display company");
            System.out.println("Enter 3 to calculate daily wages of the employee");
            System.out.println("Enter 4 to calculate monthly wages of the employee");
            System.out.println("Enter 5 to exit");
            System.out.println("--------------------------");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    company.makeCompany();
                    break;
                case 2:
                    company.displayCompany();
                    break;
                case 3:
                    company.calcDailyWage();
                    break;
                case 4:
                    company.calcMonthlyWage();
                    break;
                case 5:
                    option = 0;
                    break;
                default:
                    System.out.println("Enter a valid number");
                    break;
            }
        } while (option != 0);

    }
}
